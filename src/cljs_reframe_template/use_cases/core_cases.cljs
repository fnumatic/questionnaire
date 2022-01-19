(ns cljs-reframe-template.use-cases.core-cases
  (:require
   [re-frame.core :as rf]
   [cljs-reframe-template.db :as db]
   [clojure.walk :refer [keywordize-keys]]
   [debux.cs.core :as d :refer-macros [dbg dbgn break]]
   [ajax.json :refer [json-response-format]]
   
   [day8.re-frame.http-fx]
   [tools.reframetools :refer [sdb gdb]]
   ))
   ;[day8.re-frame.tracing :refer-macros [fn-traced defn-traced]]))

(defn gett
  ([uri on-success timeout]
   {:uri             uri
    :method          "GET"
    :response-format (json-response-format)
    :keywords? true
    :on-success      on-success
    :on-failure      [:on-failure]
    :timeout         timeout})
  ([uri on-success] (gett uri on-success 5000)))

(def nilnth
  (fnil nth [nil] 0))
(defn gen-paths [data]
  (for [[cats qs] data
        [id] qs]
    [cats id]))

(defn inc-max [max orelse n]
  (if (and (not (nil? n))  (< n max))
    (inc n)
    orelse))

(defn- game-state [current-quest-idx]
  (cond
    (nil? current-quest-idx) :finished
    :else :inprogress)
  )

(defn  answer-quest [{:keys [db]} [answer quest-path]]
  (let [max (-> db :paths count dec)
        inc_ #(inc-max max nil %)
        idx (-> db :current-quest-idx inc_)
        ]
    {:db
     (-> db
        (assoc-in [:answers quest-path] answer)
        (assoc-in [:current-quest-idx] idx))
     :fx [(when (= :finished (game-state idx)) [:dispatch [:routes/navigate :routes/stats]])]}))

(defn start-quizz []
  {:fx [[:dispatch [::fetchdemo!]]]})
(defn set-quiz [{:keys [db]} [quiz]]
  (let [p (gen-paths (get quiz "quiz"))]
    {:db
     (-> db
        (assoc :quiz quiz)
        (assoc :paths p)
        (assoc :current-quest-idx 0))
     :fx [[:dispatch [:routes/navigate :routes/quiz]]]}))
  
(defn get-question [[id quiz]]
  (-> (get-in quiz id)
      keywordize-keys
      (assoc :path id)))

(defn hud-stats [db]
  (let [p (:paths db)
        idx (:current-quest-idx db)
        quizz (get-in db [:quiz "quiz"])
        answers (:answers db)
        rf #(->> (get-in quizz  (conj % "right"))
                 (map keyword)
                 set)
        af #(get answers  %)
        a_r (map  (juxt identity rf af) p)
        aa_r (map (fn [[_ r a]] (= r a)) a_r)
        ]
    {:questcount (count p)
     :currentquest idx
     :score (* (count (filter true? aa_r)) 10)
    }))
(defn stats [db]
  (let [p (:paths db)
        quizz (get-in db [:quiz "quiz"])
        answers (:answers db)
        rf #(->> (get-in quizz  (conj % "right"))
                 (map keyword)
                 set)
        af #(get answers  %)
        a_r (map  (juxt identity rf af) p)
        aa_r (map (fn [[_ r a]] (= r a)) a_r)
        ]
    {:questcount (count p)
     :rightcount (count (filter true? aa_r))
     :answers a_r}))

(rf/reg-sub ::name :-> :name)
(rf/reg-sub ::meta (comp keywordize-keys (gdb [:quiz "meta"])))
(rf/reg-sub ::quiz (gdb [:quiz "quiz"]))
(rf/reg-sub ::paths :-> :paths)
(rf/reg-sub ::current-quest-path
            :<- [::paths]
            :<- [::current-quest-idx]
            :->  (partial apply   nilnth))
(rf/reg-sub ::current-quest-idx :-> :current-quest-idx)
(rf/reg-sub ::quest-count :-> (comp count :paths))
(rf/reg-sub ::current-quest
            :<- [::current-quest-path]
            :<- [::quiz]
             get-question)
(rf/reg-sub ::game-state
            :<- [::current-quest-idx]
            :-> #(cond
                   (nil? %) :finished
                   :else :inprogress))
(rf/reg-sub ::stats stats)
(rf/reg-sub ::hud-stats hud-stats)
(rf/reg-sub ::re-pressed-example  :->  :re-pressed-example)

;;events
(rf/reg-event-db ::current-quest-path (sdb [:current-quest]))
(rf/reg-event-db ::initialize-db (constantly db/default-db))
(rf/reg-event-fx ::set-quizdata  [rf/trim-v] set-quiz)
(rf/reg-event-fx ::answer-quest  [rf/trim-v] answer-quest)
(rf/reg-event-fx ::fetchdemo! (fn [_ _] {:http-xhrio (gett "bsiquizz.json" [::set-quizdata])}))
(rf/reg-event-fx ::start [rf/trim-v] start-quizz)
(def tdata
  {:cat1 {:q1 1 :q2 2}
   :cat2 {:q3 3 :q4 4}})



(comment
  
  (tap> @re-frame.db/app-db)
  
  
  (for [[cats qs] tdata
        [id ] qs]
    [cats id])
  
  
  (or false false)
  (map keyword #{ "a" "A"})
  (= #{1 2} #{2 1})

  (some? ( #{1 2} 3))
  (contains? #{:a :b} :c)
  (apply (fnil nth [nil] 0) [nil nil])
  (inc-max 2 nil  nil)
  (macroexpand-1
   '(-> {:c 1} :c (->> #(inc-max 2 nil %))))
  (name :a)
  
  (when (= :finished :finished) [:routes/navigate :routes/stats])
  ,)