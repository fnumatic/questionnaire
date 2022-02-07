(ns ^:figwheel-hooks questionnaire.core
  (:require
   [reagent.dom :refer [render]]
   [re-frame.core :as rf]
   [questionnaire.use-cases.core-cases :as ccases]
   [questionnaire.routes :as routes]
   [questionnaire.views.home :as views]
   [questionnaire.config :as config]
   [questionnaire.styles :as styl]))



(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (println "mount")
  (rf/clear-subscription-cache!)
  (styl/inject-trace-styles js/document)
  (render [views/main-panel]
          (.getElementById js/document "app")))

(defn ^:after-load re-render []
  (mount-root))

(defn ^:export init []
  (println "init again..")
  (rf/dispatch-sync [::ccases/initialize-db])
  (dev-setup)
  (routes/app-routes)
  ;;(rf/dispatch [::ccases/fetchdemo!])
  (rf/dispatch [:command/start-app!])
  (mount-root))