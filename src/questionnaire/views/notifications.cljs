(ns questionnaire.views.notifications 
  (:require [re-frame.core :as rf]))

(rf/reg-event-fx
 :alert/notify
 (fn [{:keys [db]} [_ notification options]]
   (let [id (or (:id notification) (random-uuid))
         {:keys [hide-after]} options]
     (merge
      {:db (update db :alert/notifications conj (assoc notification :id id))}
      (when (> hide-after 0)
        {:dispatch-later [{:ms hide-after
                           :dispatch [:alert/delete-notification id]}]})))))

(rf/reg-event-db
 :alert/delete-notification
 (fn [db [_ id]]
   (assoc db
          :alert/notifications
          (remove #(= (:id %) id) (:alert/notifications db)))))

(rf/reg-sub
 :alert/notifications
 (fn [db _]
   (:alert/notifications db)))

(defn notification [{:keys [id type content]}]
  (let [color (case type
                :success :bg-lime-200
                :warning :bg-red-200
                :bg-gray-200)]
    [:div
      {:key id
       :class [:flex :justify-between :items-center :relative  :px-4 :py-1 "width-[250px]" :rounded :text-sm color] ;;
       :role :alert}
      [:span.pr-4 content]
      [:button
       {:on-click #(rf/dispatch [:alert/delete-notification id])}
       "x"]]))

(defn notifications-view
  []
  (let [notifications @(rf/subscribe [:alert/notifications])]
    [:div
     {:class [:flex :flex-col :space-y-1 :fixed :top-0 :right-0   :p-4]}
     (for [[idx note] (map-indexed vector notifications)]
       ^{:key (:id note)}
       [notification note])]))