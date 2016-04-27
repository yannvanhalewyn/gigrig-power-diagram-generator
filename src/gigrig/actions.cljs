(ns gigrig.actions)

(defn searchfield-key-pressed [state query-value]
  {:type :key-pressed
   :value query-value})
