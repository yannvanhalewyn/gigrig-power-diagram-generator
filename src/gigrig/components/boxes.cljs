(ns gigrig.components.boxes)

(defn boxed-text [{:keys [text x y width height]}]
  [:g
   [:rect {:x x :y y :width width :height height :rx 1 :ry 1 :fill (:background text)}]
   [:text {:x (:x text) :y (:y text) :font-family "monospace" :font-size (:size text)}
    (:value text)]])

(defn react-key
  "returns a unique key for react components"
  [{:keys [text x y]}]
  (str (:value text) "-" x ":" y))
