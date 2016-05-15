(ns gigrig.selectors)

(def selected-pedals :selected-pedals)
(def search-field :search-field)
(def highlighted-idx :highlighted-idx)

(defn suggestions [state]
  (get-in state [search-field :suggestions]))

(defn query [state]
  (get-in state [search-field :query]))

(defn highlighted-pedal [state]
  (get (suggestions state) (highlighted-idx state)))

(defn apply-selectors
  "Returns a new map in the same shape as the selectors map with as
  values the result of applying the selectors to the state"
  [state selectors]
  (reduce-kv (fn [out key f] (assoc out key (f state))) {} selectors))
