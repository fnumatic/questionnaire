(ns cljs-reframe-template.views.compo
  (:require
   [cljs-reframe-template.baz :refer [ddd]]
   [clojure.walk :refer [keywordize-keys]]))

(defn info [{:keys [title pools valid] :as data}]
  [:div.p-1.border
   [:div [:h1 "Questionaire"]
    [:h2 "Title: " title]
    [:p "Containing pools:"]
    [:ul
     (map (fn [pool] 
            [:li (:id pool)]) pools)]
    [:p "valid: " (if valid "yes" "no")]]])


(defn edit-questid
  [id]
  
  [:input {:type  "number"
           :default-value id}])
           

(defn edit-question
  [question]
  [:input {:type  "text"
           :default-value question}])
           

(defn edit-answer
  [{:keys [option/key option/value quest/answer]}]
  
  (let [checked (= (last (str key)) (str answer))]

    [:div.flex.space-x-2.items-center

     [:input {:type  "text"
              :default-value value
              :size  30}]
     [:input {:type    "checkbox"
              :default-checked checked}]]))

(defn to-answeroption [k t]
  {:option/key k :option/value (k t) :quest/answer (:answer t)})

(defn quest-edit [{:keys [id question] :as data}]
  [:div.p-1.border.bg-gray-200
   [:div.flex.flex-col.space-y-1
    {:class [""]}

    [edit-questid id]
    (edit-question question)
    [:div.pt-3.flex-col.space-y-1
     (map #(edit-answer (to-answeroption % data))
          [:option1 :option2 :option3 :option4])]]])

(defn quest-widget [{:keys [tasks ] :as data}]
  [:div.container
   [:div.row
    [:div.col-md-6.col-xs-6
     (quest-edit (first tasks))]
    [:div.row
     [:div.col-md-6.col-xs-6]]]])
                          ;(om-questshow data)

(defn show-answer
  [{:keys [option/key option/value quest/answer] :as data}]
  (let [lst (last (str key))
        li [:p lst ". " value]
        answer? (= lst (str answer))
        ]
    [:li (if answer?
           [:b  li]
           li)]))
(defn show-question [{:keys [question]}]
  [:li  
   [:h3 question]])
(defn quest-show [task]
  [:ul
   [:li (:id task)]
   (show-question task)
   (map #(show-answer (to-answeroption % task))
        [:option1 :option2 :option3 :option4])])
   
(def info-data 
  {:pools [{:id :a} {:id :b}]
   :quest-title "foobar"
   :valid true})

(defn main []
    [:div
     {:class ["min-h-[220px]" "min-w-[300px]" :bg-red-50 :m-4 :p-2 "rounded-[5px]"]}
     [:h2.text-4xl "Component"]
     [:div.flex.flex-col.space-y-3.p-2
      [info (keywordize-keys ddd)]
      [quest-edit (get-in (keywordize-keys ddd) [:pools 0 :chapters 0 :tasks 0])]
      [quest-show (get-in (keywordize-keys ddd) [:pools 0 :chapters 0 :tasks 0])]
      [quest-widget (get-in (keywordize-keys ddd) [:pools 0 :chapters 0  ])]]])
      




(comment
  (js->clj ddd :keywordize-keys true)
 (js->clj #js{"hello" 1} :keywordize-keys true))
  
  