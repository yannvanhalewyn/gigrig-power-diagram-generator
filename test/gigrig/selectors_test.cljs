(ns gigrig.selectors-test
  (:require [gigrig.selectors :as s]
            [cljs.test :refer-macros [deftest is testing]]))

(def state
  {:search-field {:query "the query"
                  :suggestions ["pedal1" "pedal2"]}
   :selected-pedals [{:brand "Boss" :model "Pedal1"}]
   :highlighted-idx 1})

(deftest search-field
  (is (= {:query "the query" :suggestions ["pedal1" "pedal2"]}
         (s/search-field state))))

(deftest selected-pedals
  (is (= [{:brand "Boss" :model "Pedal1"}]
         (s/selected-pedals state))))

(deftest query
  (is (= "the query" (s/query state))))

(deftest suggestions
  (is (= ["pedal1" "pedal2"]
         (s/suggestions state))))

(deftest highlighted-pedal
  (is (= "pedal2" (s/highlighted-pedal state))))

(deftest apply-selectors
  (is (= {:query "the query"
          :pedal "pedal2"}
         (s/apply-selectors state {:query s/query :pedal s/highlighted-pedal}))))
