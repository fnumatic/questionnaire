(ns cljs-reframe-template.views.home
  (:require
    [re-frame.core :as rf]
    [cljs-reframe-template.use-cases.core-cases :as ccases]
    [tools.viewtools :as vt]
    [cljs.pprint :as pp]))
    

(defn quizz-meta [{:keys [title author licence homepage contributors] :as meta}]
  [:div.flex.flex-col.space-y-2.bg-gray-200.p-8.text-xs.items-center.rounded.shadow-md
   {:class ["w-2/3"]}
   [:h1.text-center.pb-5.text-2xl.font-semibold.text-gray-600 title]
   [:div author]
   [:div licence]
   [:a.hover:text-blue-800
    {:href homepage} homepage]
   ])
   
(defn main []
  (let [meta (rf/subscribe [::ccases/meta])]
   [:div
    {:class ["h-full" "min-w-[300px]" :bg-blue-200  :p-4  "rounded-[5px]"]}
    [:div.flex.flex-col.space-y-4.items-center.justify-end.pt-8
      [quizz-meta @meta]
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
       [view]])))
       

(defn main-panel []
  (let [active-route (rf/subscribe [:routes/current-route])]
    [:div.w-screen.h-screen.p-4.bg-gray-50
     ;[vt/navigation toolbar-items]
     [show-panel @active-route]]))
