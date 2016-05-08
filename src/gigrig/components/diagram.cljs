(ns gigrig.components.diagram
  (:require [gigrig.components.boxes :as boxes]
            [gigrig.geometry.line :as line]
            [gigrig.geometry.box :as box]
            [gigrig.zipper :as gzip]
            [clojure.zip :as zip :refer [children]]
            [clojure.string :as str]))

(defn echo [a] (.log js/console a) a)

(declare tree)

(def ROOT-OFFSET 10)
(def CHILDREN-OFFSET 25)
(def CHILD-SPACING 2)

(defn- box [loc x y]
  (case (gzip/loc-type loc)
    :pedal (boxes/pedal (last (zip/node loc)) {:x x :y y})
    :isolator (boxes/isolator {:x x :y y})
    :distributor (boxes/distributor {:x x :y y})))

(defn- align
  "Builds an array of box data's in an aligned manner"
  [loc x y]
  (let [node (zip/node loc)
        x (+ CHILD-SPACING (if (= (zip/leftmost loc) loc) x (box/right (-> loc zip/left zip/node second))))
        new-loc (zip/replace loc [(gzip/loc-type loc) (box loc x y)])]
    (if (= (zip/rightmost loc) loc)
      new-loc
      (align (zip/right new-loc) x y))))

(defn lines [lines]
  [:g {:stroke "black"
       :stroke-linecap "round"}
   (for [l lines]
     ^{:key (gensym)}
     [:line l])])

(defn child [loc]
  (case (gzip/loc-type loc)
    :pedal (boxes/boxed-text (second (zip/node loc)))))

(defn map-siblings [loc f]
  (if (= (zip/rightmost loc) loc)
    [(f loc)]
    (cons (f loc) (map-siblings (zip/right loc) f))))

(defn tree [{:keys [zipper x y]}]
  [:g]
  (let [root (box zipper x y)
        children (align (zip/down zipper) (- x ROOT-OFFSET) (+ y CHILDREN-OFFSET))]
    [:g
     [lines (line/connect-trident root (map second (zip/children (zip/up children))))]
     [boxes/boxed-text root]
     (map-siblings (zip/leftmost children) child)]))

(defn component [{:keys [zipper]}]
  (let [generator (boxes/generator {:x 0 :y 0})]
    [:div
     [:h1 "DIAGRAM"]
     [:svg {:view-box "0 0 250 100"
            :width "1200"
            :height "800"
            :style {:border "1px solid black"}}
      [boxes/boxed-text generator]
      [lines (line/connect-trident generator [(box zipper ROOT-OFFSET CHILDREN-OFFSET)])]
      [tree {:zipper zipper :x ROOT-OFFSET :y CHILDREN-OFFSET}]]]))
