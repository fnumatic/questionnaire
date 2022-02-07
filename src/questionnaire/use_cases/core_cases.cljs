(ns questionnaire.use-cases.core-cases
  (:require
   [re-frame.core :as rf]
   [questionnaire.db :as db]
   [clojure.walk :refer [keywordize-keys]]
   [debux.cs.core :as d :refer-macros [dbg dbgn break]]
   [ajax.json :refer [json-response-format]]
   
   [day8.re-frame.http-fx]
   [tools.reframetools :refer [sdb gdb nop nopfx]]
   [mainej.re-stated :as state]))
   
   
   ;[day8.re-frame.tracing :refer-macros [fn-traced defn-traced]]))

(declare quizz-machine)

(def qpath [:fsm :quizz])
(defn qm-machine  [evnt]
  (state/transition-after qpath quizz-machine  evnt))

(defn fire-cameras [& what]
  (println "!!! Transit !!! " what))

(defn nilnth [p [idx _]]
  (println :niltnth p idx)
  ((fnil nth [nil] 0) p idx))
(defn gen-paths [data]
  (for [[cats qs] data
        [id] qs]
    [cats id]))

(defn  answer-quest [db [answer quest-path]]
  (assoc-in db [:answers quest-path] answer))

(defn  inc-idx [db _]
  (let [max (-> db :paths count dec)
        idx (-> db :fsm :quizz :quest-idx)
        inc_ #(mod (inc (first %)) (inc max))
        idx (inc_ idx)]
    (assoc-in db (conj qpath :quest-idx) 
                 [idx (or (nil? idx) (>= idx max))])))

(defn start-quizz [db _]
  (assoc db :answers nil))

(defn set-quiz [db [quiz]]
  (let [p (gen-paths (get quiz "quiz"))]
    (-> db
        (assoc :quiz quiz)
        (assoc :paths p))))

(defn get-question [[id quiz]]
  (println :get-question id)
  (-> (get-in quiz id)
      keywordize-keys
      (assoc :path id)))

(defn hud-stats [[p [idx _] quizz answers]]
  (let [rf #(->> (get-in quizz  (conj % "right"))
                 (map keyword)
                 set)
        af #(get answers  %)
        a_r (map  (juxt identity rf af) p)
        aa_r (map (fn [[_ r a]] (= r a)) a_r)]

    {:questcount (count p)
     :currentquest idx
     :score (* (count (filter true? aa_r)) 10)}))
    
(defn stats [[p quizz answers]]
  (let [rf #(->> (get-in quizz  (conj % "right"))
                 (map keyword)
                 set)
        af #(get answers  %)
        a_r (map  (juxt identity rf af) p)
        aa_r (map (fn [[_ r a]] (= r a)) a_r)]
        
    {:questcount (count p)
     :rightcount (count (filter true? aa_r))
     :answers a_r}))

(defn quizz-finished? [{:keys [quest-idx]} ]
  (second quest-idx))

(def  alert-loading 
  [:alert/notify
   {:id :loading-quizz
    :content "Loading..."}])

(def alert-error 
  [:alert/notify
   {:id :error-quizz
    :content "An error happened..."}
   {:hide-after 1000}])

(def loading-machine
  {:initial :loading
   :states  {:loading {:entry  [(state/dispatch alert-loading)
                                (state/dispatch [:command/fetch-quizz!])]
                       :exit (state/dispatch [:alert/delete-notification :loading-quizz]) 
                       :on {:error   :error
                            :success [:> :quizz-prepped]}}
             :error   {:entry (state/dispatch alert-error)}}})


(def quizz-machine 
  (state/machine
   {:initial :app-start
    :id      :quizz
    :states
    {:app-start {:entry [fire-cameras]
                 :after [{:delay 1000 :target :load}]
                 :on {:load :load}}
     :load         loading-machine
     :quizz-prepped {:entry [(state/dispatch [:routes/navigate :routes/#frontpage])]
                     :on    {:start {:target  :question
                                     :actions [(state/dispatch [:command/set-quizz-idx [0 false]])
                                               (state/dispatch [:routes/navigate :routes/#quiz])]}}}

     :question      {:on    {:next-question [{:target :finished
                                              :guard  quizz-finished?}
                                             {:target :question
                                              :actions (state/dispatch [:command/inc-idx])}]
                             :finish        :finished}}
     :finished      {:entry [(state/dispatch [:routes/navigate :routes/#stats])]
                     :on    {:restart {:target :quizz-prepped}}}}}))

(rf/reg-sub ::meta (comp keywordize-keys (gdb [:quiz "meta"])))
(rf/reg-sub ::quiz (gdb [:quiz "quiz"]))
(rf/reg-sub ::paths :-> :paths)
(rf/reg-sub ::current-quest-path
            :<- [::paths]
            :<- [::current-quest-idx]
            :->  (partial apply   nilnth))
(rf/reg-sub ::current-quest-idx (gdb (conj qpath :quest-idx)))
(rf/reg-sub ::answers (gdb [:answers]))
(rf/reg-sub ::current-quest
            :<- [::current-quest-path]
            :<- [::quiz]
             get-question)


(rf/reg-sub ::stats 
            :<- [::paths]
            :<- [::quiz]
            :<- [::answers]
            stats)
(rf/reg-sub ::hud-stats
           :<- [::paths]
           :<- [::current-quest-idx]
           :<- [::quiz]
           :<- [::answers]
            hud-stats)



;;events
(rf/reg-event-db ::current-quest-path (sdb [:current-quest]))
(rf/reg-event-db ::initialize-db (constantly db/default-db))
(rf/reg-event-db :command/set-quizz-idx [rf/debug] (sdb (conj qpath :quest-idx)))
(rf/reg-event-db :command/inc-idx [rf/debug] inc-idx)

(rf/reg-event-fx :command/restart!
                 [(qm-machine :restart)]
                 nopfx)
(rf/reg-event-db ::answer-quest
                 [(qm-machine  :next-question) rf/trim-v] 
                 answer-quest)
(rf/reg-event-db ::start 
                 [(qm-machine  :start)  rf/trim-v] 
                 start-quizz)
(rf/reg-event-db :event/quizz-fetched
                 [(qm-machine :success) rf/trim-v]
                 set-quiz)

(rf/reg-event-db  :event/quizz-fetch-failed
                  [(qm-machine :error)]
                  nop)


(rf/reg-event-fx
 :command/fetch-quizz!
 (constantly
   {:http-xhrio {:uri             "bsiquizz2.json"
                 :method          :get
                 :response-format (json-response-format)
                 :on-success      [:event/quizz-fetched]
                 :on-failure      [:event/quizz-fetch-failed]}}))
  
(rf/reg-event-fx
 :command/start-app!
 [(state/initialize-after qpath quizz-machine)]
 nopfx)



(def tdata
  {:cat1 {:q1 1 :q2 2}
   :cat2 {:q3 3 :q4 4}})



(comment
  
  (tap> @re-frame.db/app-db)
  
  
  ,)
