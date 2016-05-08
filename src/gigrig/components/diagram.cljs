(ns gigrig.components.diagram
  (:require [gigrig.components.boxes :as boxes]
            [gigrig.geometry.line :as line]
            [gigrig.geometry.box :as box]
            [gigrig.zipper :as gzip]
            [clojure.string :as str]))

(defn echo [a] (.log js/console a) a)

(declare tree)

(def ROOT-OFFSET 10)
(def CHILDREN-OFFSET 25)
(def CHILD-SPACING 2)

(defn- box [node x y]
  (case (first node)
    :pedal (boxes/pedal (last node) {:x x :y y})
    :isolator (boxes/isolator {:x x :y y})
    :distributor (boxes/distributor {:x x :y y})))

(defn- align
  "Builds an array of box data's in an aligned manner"
  [children x y]
  (reduce
   (fn [out child]
     (let [x (+ CHILD-SPACING (if (empty? out) x (box/right (second (last out)))))]
       (conj out [(first child) (box child x y)])))
   []
   children))

(defn lines [lines]
  [:g {:stroke "black"
       :stroke-linecap "round"}
   (for [l lines]
     ^{:key (gensym)}
     [:line l])])

(defn child [[type {:keys [x y] :as props}]]
  (case type
    :pedal (boxes/boxed-text props) 
    :distributor [tree {:x x :y y :type type} (:children props)]
    :isolator [tree {:x x :y y :type type} (:children props)]))

(defn tree [{:keys [zipper x y]}]
  (let [root (box zipper x y)
        children (align (rest zipper) (- x ROOT-OFFSET) (+ y CHILDREN-OFFSET))]
    [:g
     [lines (line/connect-trident root (map second children))]
     [boxes/boxed-text root]
     (map
      (fn [c] ^{:key (gensym)} [child c])
      children)]))

(defn component [props]
  (let [generator (boxes/generator {:x 0 :y 0})]
    [:div
     [:h1 "DIAGRAM"]
     [:svg {:view-box "0 0 250 100"
            :width "1200"
            :height "800"
            :style {:border "1px solid black"}}
      [boxes/boxed-text generator]
      [lines (line/connect-trident generator [(box (:tree props) ROOT-OFFSET CHILDREN-OFFSET)])]
      [tree {:zipper (:tree props) :x ROOT-OFFSET :y CHILDREN-OFFSET}]]]))
