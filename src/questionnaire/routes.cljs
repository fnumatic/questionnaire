(ns questionnaire.routes
  (:require
   [re-frame.core :as rf]
   [reitit.frontend :as rtf]
   [reitit.frontend.easy :as rtfe]
   [reitit.coercion.schema :as rsc]
   [tools.reframetools :refer [sdb gdb]]
   [questionnaire.views.home :as home]
   [questionnaire.views.quiz :as quiz]
   [questionnaire.views.stats :as stats]
   ))

;;https://clojure.org/guides/weird_characters#__code_code_var_quote
(def routes
    (rtf/router
      ["/"
       [""
        {:name :routes/#frontpage
         :view #'home/main}]
       ["quiz"
        {:name :routes/#quiz
         :view #'quiz/main}]
       ["stats"
        {:name :routes/#stats
         :view #'stats/main}]]

      {:data {:coercion rsc/coercion}}))

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
 (sdb [:current-route] ))

(rf/reg-event-fx
 :routes/navigate
 (fn [_cofx [_ & route]]
   {:routes/navigate! route}))

(rf/reg-fx
 :routes/navigate!
 (fn [route]
   (apply rtfe/push-state route)))

