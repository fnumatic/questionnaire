(ns ^:figwheel-hooks questionnaire.core
  (:require ["react-dom/client" :refer [createRoot]]
            [goog.dom :as gdom]
            [questionnaire.config :as config]
            [questionnaire.routes :as routes]
            [questionnaire.styles :as styl]
            [questionnaire.use-cases.core-cases :as ccases]
            [questionnaire.views.home :as views]
            [re-frame.core :as rf]
            [reagent.core :as r]))



(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defonce root (createRoot (gdom/getElement "app")))

(defn mount-root []
  (println "mount")
  (rf/clear-subscription-cache!)
  (styl/inject-trace-styles js/document)
  (.render root (r/as-element [views/main-panel])))

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