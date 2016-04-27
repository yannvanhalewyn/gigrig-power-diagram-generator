(ns gigrig.components.diagram)

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
  (boxed-text-data (merge props {:text "Distributor" :background "Green" :size 9})))

(defn component [props]
  [:div
   [:h1 "DIAGRAM"]
   [:svg {:view-box "0 0 200 100"
          :width "800"
          :height "400"
          :style {:border "1px solid black"}}
    [boxed-text (generator {:x 0 :y 0})]
    [:g {:stroke "black"
         :stroke-width 1}
     [:line {:x1 23 :y1 18 :x2 23 :y2 38}]]
    [boxed-text (distributor {:x 10 :y 38})]]])
