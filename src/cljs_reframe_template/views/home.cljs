(ns cljs-reframe-template.views.home
  (:require
    [re-frame.core :as rf]
    [cljs-reframe-template.use-cases.core-cases :as ccases]
    [tools.viewtools :as vt]
    [cljs.pprint :as pp]
    ))

(defn quizz-meta [{:keys [title author] :as meta}]
  [:div.flex.flex-col.space-y-2.bg-gray-200.p-2
   [:div title]
   [:div author]])
(defn main []
  (let [meta (rf/subscribe [::ccases/meta])
        ]
   [:div
    {:class ["min-h-[220px]" "min-w-[300px]" :bg-blue-200 :m-4 :p-2 "rounded-[5px]"]}
    [:div.flex.flex-col.space-y-3.items-center.justify-end
    ;;  [quizz-meta @meta]
    ;;  [:button.h-20.w-40.bg-green-700.rounded-md.text-4xl.font-semibold.text-gray-700.border.shadow-md
    ;;   {:on-click #(rf/dispatch [::ccases/start])}
    ;;   "Load"]
     [:button.h-20.w-40.bg-orange-700.rounded-md.text-4xl.font-semibold.text-gray-700.border.shadow-md
      {:on-click #(rf/dispatch [::ccases/start])}
      "Start"]]]))

(def toolbar-items
  [
   ["#" :routes/frontpage]
   ["quizz" :routes/quiz]
   ["stats" :routes/stats]])

(defn route-info [route]
  [:div.m-4
   [:p "Routeinfo"]
   [:pre.border-solid.border-2.rounded
    (with-out-str (pp/pprint route))]])
;; main

(defn show-panel [route]
  (when-let [route-data (:data route)]
    (let [view (:view route-data)]
      [:<>
       [view]
       ])))

(defn main-panel []
  (let [active-route (rf/subscribe [:routes/current-route])]
    [:div
     ;[vt/navigation toolbar-items]
     [show-panel @active-route]]))
