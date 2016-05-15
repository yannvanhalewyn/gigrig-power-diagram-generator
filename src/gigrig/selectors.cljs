(ns gigrig.selectors)

(def selected-pedals :selected-pedals)
(def search-field :search-field)

(defn suggestions [state]
  (get-in state [search-field :suggestions]))

(defn highlighted-pedal [state]
  (first (suggestions state)))
