(ns gigrig.constants)

(def ADAPTERS [{:name "TimeLord" :key :time-lord :color "#225678"}
               {:name "Doubler"  :key :doubler   :color "#078"}
               {:name "EvenFlo"  :key :even-flo  :color "#972"}
               {:name "VB-BC"    :key :vb-bc     :color "#abc"}
               {:name "ACA-AOK"  :key :aca-aok   :color "#cba"}])

(def BRANCHES [:distributor :isolator])

(def GIGRIG-PRODUCTS (apply conj BRANCHES (map :key ADAPTERS)))
