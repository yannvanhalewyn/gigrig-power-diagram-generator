(ns gigrig.geometry.box)

(defn center
  "Returns a point representing the center of the given box"
  [box]
  {:x (+ (:x box) (/ (:width box) 2))
   :y (+ (:y box) (/ (:height box) 2))})
