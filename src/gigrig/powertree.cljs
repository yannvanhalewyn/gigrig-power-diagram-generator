(ns gigrig.powertree)

(defn- simplify
  "returns a hashmap containing the prefered type of the power supply"
  [pedal]
  {:type (-> (filter val pedal)
             keys
             last)})
