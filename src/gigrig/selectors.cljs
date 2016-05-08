(ns gigrig.selectors)

(defn selected-pedals
  "Returns a sequence of pedals found in searchfields as selected"
  [state]
  (->> (:searchfields state)
       (map #(-> % vals first :pedal))
       (filter (complement nil?))))
