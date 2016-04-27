(ns gigrig.geometry.line
  (:require [gigrig.geometry.box :as box]))

(defn line
  "Returns line-data from p1 to p2"
  [p1 p2]
  {:x1 (:x p1) :y1 (:y p1)
   :x2 (:x p2) :y2 (:y p2)})

(defn connect
  "Returns data for a line connecting the center of box1 to the center
  of box2"
  [box1 box2]
  (line (box/center box1) (box/center box2)))
