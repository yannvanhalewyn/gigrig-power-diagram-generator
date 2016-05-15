(ns gigrig.constants)

(def ADAPTERS {"TimeLord" :time-lord
               "Doubler" :doubler
               "EvenFlo" :even-flo
               "VB-BC" :vb-bc
               "ACA-AOK" :aca-aok})

(def BRANCHES [:distributor :isolator])

(def GIGRIG-PRODUCTS (apply conj BRANCHES (vals ADAPTERS)))
