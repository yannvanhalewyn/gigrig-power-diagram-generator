(ns gigrig.constants)

(def ADAPTERS [{:name "TimeLord"            :key :time-lord     :color "#225678"}
               {:name "Doubler"             :key :doubler       :color "#078"}
               {:name "EvenFlo"             :key :even-flo      :color "#972"}
               {:name "VB-BC"               :key :vb-bc         :color "#abc"}
               {:name "SupaNova"            :key :supa-nova     :color "#c55"}
               {:name "ElectroMan"          :key :electro-man   :color "#6a9"}
               {:name "Line6 Cable adapter" :key :line6-adapter :color "#676"}
               {:name "ElPaso"              :key :el-paso       :color "#a64"}
               {:name "ACA-AOK"             :key :aca-aok       :color "#cba"}])

(def BRANCHES [:distributor :isolator])

(def GIGRIG-PRODUCTS (apply conj BRANCHES (map :key ADAPTERS)))
