(ns gigrig.selectors-test
  (:require [cljs.test :refer-macros [deftest is testing]]
            [gigrig.selectors :as s]))

(deftest selected-pedals
  (is (= ["pedal1" "pedal2"]
         (s/selected-pedals
          {:searchfields [{:g__1 {:pedal "pedal1"}}
                          {:g__2 {:pedal "pedal2"}}]})))
  (is (= ["pedal2"]
         (s/selected-pedals
          {:searchfields [{:g__1 {:pedal nil}}
                          {:g__2 {:pedal "pedal2"}}]}))))

