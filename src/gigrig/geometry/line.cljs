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

(defn connect-trident
  "Returns an array of lines that would connect one box to multiple
  subboxes in a 'trident' fashion"
  [root children]
  (let [offsets (map #(:x (box/center %)) (conj children root))
        y-height (+ (box/bottom root) (/ (- (:y (first children)) (box/bottom root)) 2))
        left-x (apply min offsets)
        right-x (apply max offsets)]
    (concat
     [;; The horizontal line from leftest to rightest child 
      (line {:x left-x :y y-height} {:x right-x :y y-height})
      ;; The vertical line from root 
      (line {:x (:x (box/center root)) :y y-height} {:x (:x (box/center root)) :y (box/bottom root)})]
     ;; The vertical lines for all children
     (for [box children]
       (let [x (:x (box/center box))]
         (line {:x x :y y-height} {:x x :y (:y box)}))))))

(let [box1 {:x 50 :y 50 :width 10 :height 10}
      box2 {:x 20 :y 50 :width 10 :height 10}]
  (connect-trident {:x 0 :y 0} [box1 box2]))
