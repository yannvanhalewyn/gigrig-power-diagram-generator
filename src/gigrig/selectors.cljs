(ns gigrig.selectors)

(defn selected-pedals
  "Returns a sequence of pedals found in searchfields as selected"
  [state]
  (filter (complement nil?) (map :pedal (-> state :search-fields vals))))
