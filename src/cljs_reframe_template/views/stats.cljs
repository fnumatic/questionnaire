(ns cljs-reframe-template.views.stats
  (:require
   [cljs-reframe-template.baz :refer [ddd]]
   [re-frame.core :as rf]
   [cljs-reframe-template.use-cases.core-cases :as ccases]
   [reagent.core :refer [with-let]]))

(defn sorted-keys [k]
  [:<>
   (for [k_ (sort (map name k))]
     ^{:key k_}
     [:span.mx-1 k_])])

(defn stats [{:keys [questcount rightcount answers]}]
  [:div.p-2
   [:h2.text-4xl.font-semibold.text-gray-600 "Stats"]
   [:div.flex.space-x-2 [:div.w-40 "Questions:"] questcount]
   [:div.flex.space-x-2 [:div.w-40 "Right:"] rightcount]
   [:div.h-80.overflow-auto.mt-3
    [:div.table.w-full
     [:div.table-header-group
      [:div.table-row.bg-gray-500
       [:div.table-cell "Question"]
       [:div.table-cell "Right response"]
       [:div.table-cell "Your response"]]]
       
     (for [[p r a] answers]
       ^{:key p}
       [:div.table-row.border.border-gray-800.text-gray-700.text-xs
        {:class (when (not= r a) [:bg-red-200])}
        [:div.table-cell.p-1 (str p)]
        [:div.table-cell [sorted-keys r]]
        [:div.table-cell [sorted-keys a]]])]]])

(defn main []
  (let [meta (rf/subscribe [::ccases/meta])
        game-state (rf/subscribe [::ccases/game-state])
        statsdata (rf/subscribe  [::ccases/stats])]
    (println :main @game-state)
   [:div
    {:class ["h-full" "min-w-[300px]" :bg-gray-200  :p-2 "rounded-[5px]"]}
    [:div.flex.flex-col.space-y-3
     [stats @statsdata]]
     [:div.flex.justify-center
      [:button.h-20.w-40.bg-green-700.rounded-md.text-4xl.font-semibold.text-gray-700.border.shadow-md
       {:on-click #(rf/dispatch [:routes/navigate :routes/frontpage])}
       "Back"]]
    ]))
     ;[quizz-meta (keywordize-keys @meta)]
     


(comment
  (js->clj ddd :keywordize-keys true)
 (js->clj #js{"hello" 1} :keywordize-keys true))
  
  