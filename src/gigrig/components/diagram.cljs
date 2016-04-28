(ns gigrig.components.diagram
  (:require [gigrig.components.boxes :as boxes]
            [gigrig.geometry.line :as line]
            [gigrig.geometry.box :as box]
            [clojure.string :as str]))

(declare tree)

(def ROOT-OFFSET 10)
(def CHILDREN-OFFSET 25)

(defn- box [child x y]
  (case (:type child)
    :pedal (boxes/pedal (:name child) {:x x :y y})
    :isolator (boxes/isolator {:x x :y y})
    :distributor (boxes/distributor {:x x :y y})))

(defn- align
  "Builds an array of box data's in an aligned manner"
  [children x y]
  (reduce
   (fn [out child]
     (let [x (+ 1 (if (empty? out) x (box/right (last out))))]
       (conj out (merge child (box child x y)))))
   []
   children))

(defn lines [lines]
  [:g {:stroke "black"
       :stroke-linecap "round"}
   (for [l lines]
     ^{:key (gensym)}
     [:line l])])

(defn child [{:keys [x y type] :as props}]
  (case type
    :pedal (boxes/boxed-text props) 
    :distributor [tree {:x x :y y :type type} (:children props)]
    :isolator [tree {:x x :y y :type type} (:children props)]))

(defn tree [{:keys [type x y]} children]
  (let [root (box {:type type} x y)
        children (align children (- x ROOT-OFFSET) (+ y CHILDREN-OFFSET))]
    [:g
     [lines (line/connect-trident root children)]
     [boxes/boxed-text root]
     (map
      (fn [c] ^{:key (gensym)} [child c])
      children)]))

(defn component [props]
  (let [generator (boxes/generator {:x 0 :y 0})]
    [:div
     [:h1 "DIAGRAM"]
     [:svg {:view-box "0 0 250 125"
            :width "800"
            :height "400"
            :style {:border "1px solid black"}}
      [boxes/boxed-text generator]
      [tree {:type (:type props) :x ROOT-OFFSET :y CHILDREN-OFFSET}
       (:children props)]]]))
