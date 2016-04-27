(ns gigrig.components.diagram)

(defn boxed-text [{:keys [text size background x y]}]
  (let [padding 2
        height (* 1.35 size)
        width (* 0.6 (count text) size)
        box-width (+ (* 2 padding) width)
        box-height (+ (* 2 padding) height)
        text-x (+ x padding)
        text-y (+ y size padding)]
    [:g
     [:rect {:x x :y y :width box-width :height box-height :fill background}]
     [:text {:x text-x :y text-y :font-family "monospace" :font-size size}
      text]]))

(defn generator [{:keys [x y]}]
  [boxed-text {:x x :y y :text "Generator" :size 13 :background "orange"}])

(defn distributor [{:keys [x y]}]
  [boxed-text {:x x :y y :text "Distributor" :size 9 :background "green"}])

(defn component [props]
  [:div
   [:h1 "DIAGRAM"]
   [:svg {:view-box "0 0 200 100"
          :width "800"
          :height "400"
          :style {:border "1px solid black"}}
    [generator {:x 0 :y 0}]
    [:g {:stroke "black"
         :stroke-width 1}
     [:line {:x1 23 :y1 18 :x2 23 :y2 38}]]
    [distributor {:x 10 :y 38}]]])
