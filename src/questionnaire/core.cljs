(ns ^:figwheel-hooks questionnaire.core
  (:require ["react-dom/client" :refer [createRoot]]
            [goog.dom :as gdom]
            [questionnaire.config :as config]
            [questionnaire.routes :as routes]
            [questionnaire.styles :as styl]
            [questionnaire.use-cases.core-cases :as ccases]
            [questionnaire.views.home :as views]
            [re-frame.core :as rf]
            [react :as react]
            [reagent.dom.client :as rdc]
            ))



(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defonce root (rdc/create-root (gdom/getElement "app")))

(defn mount-root []
  (rf/clear-subscription-cache!)
  (styl/inject-trace-styles js/document)
  (rdc/render root [:> react/StrictMode {} [#'views/main-panel]] ))

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