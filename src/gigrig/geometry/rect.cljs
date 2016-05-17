(ns gigrig.geometry.rect)

(defn center
  "Returns a point representing the center of the given box"
  [box]
  {:x (+ (:x box) (/ (:width box) 2))
   :y (+ (:y box) (/ (:height box) 2))})

(defn bottom
  "Returns the height of the box's bottom line"
  [box]
  (+ (:y box) (:height box)))

(defn right
  "Returns the x position of the box's eastern side"
  [box]
  (+ (:x box) (:width box)))
