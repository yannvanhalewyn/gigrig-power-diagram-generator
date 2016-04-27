(ns gigrig.components.diagram
  (:require [gigrig.components.boxes :as boxes]
            [gigrig.geometry.line :as line]
            [gigrig.geometry.box :as box]
            [clojure.string :as str]))

(defn- trunc [s n] (str/join (take n s)))

(defn- align
  "Builds an array of box data's in an aligned manner"
  [children x y]
  (reduce
   (fn [out child]
     (let [x (+ 1 (if (empty? out) x (box/right (last out))))]
       (conj out
             (merge child
                    (case (:type child)
                      :pedal (boxes/pedal (trunc (:name child) 13) {:x x :y y})
                      :distributor (boxes/distributor {:x x :y y}))))))
   []
   children))

(defn lines [lines]
  [:g {:stroke "black"
       :stroke-linecap "round"}
   (for [l lines]
     ^{:key (gensym)}
     [:line l])])

(declare tree)
(defn child [props]
  (case (:type props)
    :pedal (boxes/boxed-text (boxes/pedal (trunc (:name props) 13) props)) 
    :distributor [tree {:x (:x props) :y (:y props)} (:children props)]))

(defn tree [{:keys [x y]} children]
  (let [root (boxes/distributor {:x x :y y})
        children (align children x (+ y 25))]
    (.log js/console children)
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
     [:svg {:view-box "0 0 200 100"
            :width "800"
            :height "400"
            :style {:border "1px solid black"}}
      [boxes/boxed-text generator]
      [tree {:x 10 :y 25}
       (:children props)]]]))
