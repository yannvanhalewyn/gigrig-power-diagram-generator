(ns gigrig.geometry.line
  (:require [gigrig.geometry.rect :as rect]))

(def TRIDENT-MIDDLE-BAR-HEIGHT "The height of the trident middlebar above the children" 2.5)

(defn line
  "Returns line-data from p1 to p2"
  [p1 p2]
  {:x1 (:x p1) :y1 (:y p1)
   :x2 (:x p2) :y2 (:y p2)})

(defn connect
  "Returns data for a line connecting the center of box1 to the center
  of box2"
  [box1 box2]
  (line (rect/center box1) (rect/center box2)))

(defn connect-trident
  "Returns an array of lines that would connect one box to multiple
  subboxes in a 'trident' fashion"
  [root children]
  (let [offsets (map #(:x (rect/center %)) (conj children root))
        y-height (- (:y (first children)) TRIDENT-MIDDLE-BAR-HEIGHT)
        left-x (apply min offsets)
        right-x (apply max offsets)]
    (concat
     [;; The horizontal line from leftest to rightest child 
      (line {:x left-x :y y-height} {:x right-x :y y-height})
      ;; The vertical line from root 
      (line {:x (:x (rect/center root)) :y y-height} {:x (:x (rect/center root)) :y (rect/bottom root)})]
     ;; The vertical lines for all children
     (for [box children]
       (let [x (:x (rect/center box))]
         (line {:x x :y y-height} {:x x :y (:y box)}))))))

(defn react-key
  "Returns a unique key for react components"
  [{:keys [x1 y1 x2 y2]}]
  (str x1 ":" y1 "-" x2 ":" y2))
