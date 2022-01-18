(ns cljs-reframe-template.views.quiz
  (:require
   [cljs-reframe-template.baz :refer [ddd]]
   [re-frame.core :as rf]
   [cljs-reframe-template.use-cases.core-cases :as ccases]
   [reagent.ratom :as ratom]
   [reagent.core :refer [with-let]]))




(defn quest-line [st clck id q]
  (let [selct (some? ((doall st) id))]
   [:div.flex.space-x-4.items-center.border.h-20.bg-gray-50.hover:shadow-lg
    {:on-click #(clck id)}
    [:div
     {:class (concat [:flex :justify-center :items-center :w-20 :h-full 
                      :text-center :border :flex-none] 
                     (if selct [:bg-blue-500 :border :border-4 :border-blue-600 ] [:bg-blue-400]))
      :on-click #(clck id)}
     [:div.text-gray-100.text-2xl.font-bold id]]
    [:div.flex.h-full.w-full.p-1.pr-4.items-center [:div q]]]))
   
(defn quizz-quest [{:keys [path question answers right] :as data}]
  (with-let [st (ratom/atom #{})
             clck #(swap! st (if (contains?  @st %)  disj conj) %)
             [cat qid] path]
   [:div.flex.flex-col.space-y-2.p-2
    [:h2.text-lg.font-semibold.text-gray-700 cat]
    [:div.pt-2.flex.space-x-2
     [:div.flex-none qid]
     [:div.h-full question]]
    (doall
     (for [[id q] answers]
       ^{:key id}
       [quest-line  @st clck id q]))
    [:input.border.w-40.h-20.py-1.px-2.bg-blue-200.text-2xl.rounded-md.shadow.m-auto
     {:type :button :value "OK" :on-click #(do
                                             (rf/dispatch [::ccases/answer-quest @st path])
                                             (reset! st #{}))}]]))

(defn quizz-hud [{:keys [questcount currentquest score]}]
  [:div.flex.justify-between
   [:div.mx-2
    [:p "Question"]
    [:h2.text-4xl.font-semibold (str (inc currentquest) "/" questcount)]]
   [:div.mx-2
    [:p "Score"]
    [:h2.text-4xl.font-semibold score]]])

(defn main []
  (let [meta (rf/subscribe [::ccases/meta])
        current-quest (rf/subscribe [::ccases/current-quest])
        hud-stats (rf/subscribe [::ccases/hud-stats])
        ]
   [:div
    {:class ["min-h-[220px]" "min-w-[300px]" :bg-green-50 :m-4 :p-2 "rounded-[5px]"]}
    [:div.flex.flex-col.space-y-3
     [quizz-hud @hud-stats]
     [quizz-quest @current-quest]
     ]]))



(comment
  (js->clj ddd :keywordize-keys true)
 (js->clj #js{"hello" 1} :keywordize-keys true))
  
  