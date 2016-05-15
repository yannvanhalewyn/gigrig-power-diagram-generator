(ns gigrig.search-test
  (:require [gigrig.search :as search]
            [cljs.test :refer-macros [deftest is testing]]))

(def pedals
  [{:model "Supa-Trem" :brand "Fulltone"}
   {:model "TS9 Tubescreamer" :brand "Ibanez"}
   {:model "DD-20 Giga Delay" :brand "Boss"}])

(deftest basic-search
  (is (= [(first pedals)] (search/search pedals "Supa")))
  (is (= [(last pedals)] (search/search pedals "Boss"))))

(deftest multi-word
  (is (= [(first pedals)] (search/search pedals "Supa Trem")))
  (is (= [(last pedals)] (search/search pedals "Boss Giga"))))

(deftest freedom
  (is (= [(last pedals)] (search/search pedals "dd20")))
  (is (= [(second pedals)] (search/search pedals "TS-9"))))
