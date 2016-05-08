(ns gigrig.zipper-test
  (:require [gigrig.zipper :as gzip]
            [clojure.zip :as zip]
            [cljs.test :refer-macros [deftest is testing]]))

(deftest zipper
  (is (= [:distributor] (-> (gzip/zipper) zip/node)))
  (let [z (gzip/zipper [:distributor [[:pedal "pedal1"] [:pedal "pedal2"]]])]
    (is (= [[:pedal "pedal1"] [:pedal "pedal2"]] (zip/children z)))
    (is (= [:pedal "pedal2"] (-> z zip/down zip/right zip/node)))))

(deftest loc-type
  (let [z (gzip/zipper [:distributor [[:pedal "pedal1"] [:isolator [[:pedal "pedal1"]]]]])]
    (is (= :distributor (gzip/loc-type z)))
    (is (= :pedal (-> z zip/down gzip/loc-type)))
    (is (= :isolator (-> z zip/down zip/right gzip/loc-type)))))

(deftest box-meta
  (let [z (gzip/zipper [:distributor [[:pedal "pedal1" {:meta "pedal"}]] {:meta "distributor"}])]
    (is (= {:meta "distributor"} (gzip/box-meta z)))
    (is (= {:meta "pedal"} (-> z zip/down gzip/box-meta)))))

(deftest set-meta
  (let [z (gzip/zipper [:distributor [[:isolator []]]])]
    (is (= [:distributor [[:isolator []]] {:meta "true"}]
           (-> z (gzip/set-meta {:meta "true"}) zip/node)))
    (is (= [:isolator [] {:foo "bar"}]
           (-> z zip/down (gzip/set-meta {:foo "bar"}) zip/node)))))
