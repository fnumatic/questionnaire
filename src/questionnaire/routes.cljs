(ns questionnaire.routes
  (:require
   [re-frame.core :as rf]
   [reitit.frontend :as rtf]
   [reitit.frontend.easy :as rtfe]
   [tools.reframetools :refer [sdb gdb]]
   [questionnaire.views.home :as home]
   [questionnaire.views.quiz :as quiz]
   [questionnaire.views.stats :as stats]
   [spec-tools.data-spec :as ds]
   [schema.core :as s]))
   

;;https://clojure.org/guides/weird_characters#__code_code_var_quote
(def routes
    (rtf/router
      ["/"
       [""
        {:name :routes/#frontpage
         :view #'home/main
         ;:parameters       {:query {(ds/opt :file) keyword?}}
         :controllers
         [{:start (constantly (js/console.log "Entering home page"))}]}]
       ["/:id"
        {:name :routes/#load-file
         :parameters       {:path  {:id s/Int}
                            :query {(ds/opt :file) s/Keyword}
                            }
         }]
       ["quiz"
        {:name :routes/#quiz
         :view #'quiz/main}]
       ["stats"
        {:name :routes/#stats
         :view #'stats/main}]]
      ,))

(defn on-navigate [new-match]
  (when new-match
    (rf/dispatch [:routes/navigated new-match])))

(defn app-routes []
  (rtfe/start! routes
               on-navigate
               {:use-fragment true}))

(rf/reg-sub
 :routes/current-route
 :-> :current-route)

;;; Events

(rf/reg-event-db
 :routes/navigated
 (sdb [:current-route]))

(rf/reg-event-fx
 :routes/navigate
 (fn [_cofx [_ & route]]
   {:routes/navigate! route}))

(rf/reg-fx
 :routes/navigate!
 (fn [route]
   (apply rtfe/push-state route)))

