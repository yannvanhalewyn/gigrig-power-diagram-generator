(ns gigrig.reducers)

(defn- search-fields [state action]
  (case (:type action)
    :init {(gensym) {:query ""}}
    :add-search-field (assoc state (gensym) {:query ""})
    :remove-search-field (dissoc state (:id action))
    :key-pressed (assoc state (:id action) (select-keys action [:query :suggestions]))
    state))

(defn combine-reducers [reducers]
  (fn [state action]
    (reduce-kv (fn [out key f] (assoc out key (f (key state) action))) {} reducers)))

(def app
  (combine-reducers
   {:search-fields search-fields}))