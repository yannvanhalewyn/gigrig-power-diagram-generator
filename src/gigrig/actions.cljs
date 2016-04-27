(ns gigrig.actions
  (:require [gigrig.search :as s]))

(defonce data
  [
   {:brand "Boss" :model "DD-20 Giga Delay" :distributor true :isolator true}
   {:brand "Ibanez" :model "TS9 TubeScreamer" :distributor true :isolator true}
   {:brand "Electro-Harmonix" :model "Micro POG" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Aguilar" :model "Agro" :distributor true :isolator true}])

(defn searchfield-key-pressed [state query-value]
  {:type :key-pressed
   :value query-value
   :suggestions (s/search data query-value)})
