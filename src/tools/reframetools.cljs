(ns tools.reframetools)

(defn sdb [path]
  (fn [db [_ v]]
    (assoc-in db path v)))

(defn gdb
  [path]
  (fn [db _] (get-in db path)))

(defn target-value [evt]
  (-> evt .-target .-value))

(defn target-checked [evt]
  (-> evt .-target .-checked))

(defn nop [db [_ ]] db)
(def nopfx (constantly {}))