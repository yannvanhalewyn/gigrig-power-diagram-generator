(ns gigrig.components.diagram
  (:require [gigrig.components.boxes :as boxes]
            [gigrig.geometry.line :as line]
            [clojure.string :as str]))

(defn- align [pedals]
  (map-indexed
   #(boxes/pedal (str/join (take 7 %2)) {:x (* %1 30) :y 70})
   pedals))

(defn component [props]
  (let [pedals '("Whammy" "DD-20 Giga Delay" "RE-20 Space Echo" "Earthquaker Bit Commander")
        pedal-dims (align pedals)
        generator-dims (boxes/generator {:x 0 :y 0})
        distributor-dims (boxes/distributor {:x 20 :y 30})]
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
         [:line (line/connect distributor-dims pd)]))
      [boxes/boxed-text generator-dims]
      [boxes/boxed-text distributor-dims]
      (map (fn [p] ^{:key (gensym)} [boxes/boxed-text p]) pedal-dims)]]))
