(ns gigrig.components.diagram
  (:require [clojure.string :as str]))

(defn boxed-text-data
  "Returns the dimensions and data required to render a boxed text element"
  [{:keys [text size background x y]}]
  (let [padding 2
        inner-width (* 0.6 (count text) size)
        inner-height (* 1.35 size)]
    {:x x
     :y y
     :width (+ (* 2 padding) inner-width)
     :height (+ (* 2 padding) inner-height)
     :text {:value text
            :size size
            :background background
            :x (+ x padding)
            :y (+ y padding size)}}))

(defn boxed-text [{:keys [text x y width height]}]
  [:g
   [:rect {:x x :y y :width width :height height :fill (:background text)}]
   [:text {:x (:x text) :y (:y text) :font-family "monospace" :font-size (:size text)}
    (:value text)]])

(defn generator [props]
  (boxed-text-data (merge props {:text "Generator" :background "Orange" :size 13})))

(defn distributor [props]
  (boxed-text-data (merge props {:text "Distributor" :background "Green" :size 7})))

(defn pedal [name props]
  (boxed-text-data (merge props {:text name :background "Purple" :size 5})))

(defn center [box]
  {:x (+ (:x box) (/ (:width box) 2))
   :y (+ (:y box) (/ (:height box) 2))})

(defn line [p1 p2]
  {:x1 (:x p1) :y1 (:y p1)
   :x2 (:x p2) :y2 (:y p2)})

(defn- connect [box1 box2]
  (line (center box1) (center box2)))

(defn- align [pedals]
  (map-indexed
   #(pedal (str/join (take 7 %2)) {:x (* %1 30) :y 70})
   pedals))

(defn component [props]
  (let [pedals '("Whammy" "DD-20 Giga Delay" "RE-20 Space Echo" "Earthquaker Bit Commander")
        pedal-dims (align pedals)
        generator-dims (generator {:x 0 :y 0})
        distributor-dims (distributor {:x 20 :y 30})]
    [:div
     [:h1 "DIAGRAM"]
     [:svg {:view-box "0 0 200 100"
            :width "800"
            :height "400"
            :style {:border "1px solid black"}}
      (into
       [:g {:stroke "black"
            :stroke-width 1}]
       (for [pd (conj pedal-dims generator-dims)]
         ^{:key (str (:x pd) (:y pd))}
         [:line (connect distributor-dims pd)]))
      [boxed-text generator-dims]
      [boxed-text distributor-dims]
      (map boxed-text pedal-dims)]]))
