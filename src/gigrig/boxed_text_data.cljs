(ns gigrig.boxed-text-data)

(defn- boxed-text-data
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
  (boxed-text-data (merge props {:text "Generator" :background "#4E4554" :size 13})))

(defn distributor [props]
  (boxed-text-data (merge props {:text "Distributor" :background  "#BEA488":size 5})))

(defn isolator [props]
  (boxed-text-data (merge props {:text "Isolator" :background  "#A1748A" :size 5})))

(defn pedal [name props]
  (boxed-text-data (merge props {:text name :background "#DCD7B3" :size 3})))

(defn time-lord [props]
  (boxed-text-data (merge props {:text "Time Lord" :background "#225678" :size 4})))