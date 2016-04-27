(ns gigrig.components.boxes)

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

(defn generator [props]
  (boxed-text-data (merge props {:text "Generator" :background "Orange" :size 13})))

(defn distributor [props]
  (boxed-text-data (merge props {:text "Distributor" :background "Green" :size 7})))

(defn pedal [name props]
  (boxed-text-data (merge props {:text name :background "Purple" :size 5})))

(defn boxed-text [{:keys [text x y width height]}]
  [:g
   [:rect {:x x :y y :width width :height height :fill (:background text)}]
   [:text {:x (:x text) :y (:y text) :font-family "monospace" :font-size (:size text)}
    (:value text)]])