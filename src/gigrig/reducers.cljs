(ns gigrig.reducers)

(defn- vec-remove [coll pos]
  (vec (concat (subvec coll 0 pos) (subvec coll (inc pos)))))

(defn- search-field [state action]
  (case (:type action)
    :init {:query "" :suggestions []}
    :key-pressed (select-keys action [:query :suggestions])
    :pedal-selected {:query "" :suggestions []}
    state))

(defn- selected-pedals [state action]
  (case (:type action)
    :init []
    :pedal-selected (conj state (:pedal action))
    :pedal-removed (vec-remove state (:id action))
    state))

(defn- highlighted-idx [state action]
  (case (:type action)
    :init 0
    :key-pressed (:highlight-index action)
    :update-highlight-index (:idx action)
    state))

(def reducers {:search-field search-field
               :selected-pedals selected-pedals
               :highlighted-idx highlighted-idx})

(defn app [state action]
  (reduce-kv (fn [out key f] (assoc out key (f (key state) action))) {} reducers))
