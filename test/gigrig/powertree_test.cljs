(ns gigrig.powertree-test
  (:require [cljs.test :refer-macros [deftest is testing]]
            [clojure.zip :as zip]
            [gigrig.powertree :as ptree]))

(defn echo [arg]
  (.log js/console arg)
  arg)

(defn distributor-pedal [n]
  {:type :pedal
   :name (str "pedal" n)
   :distributor true})

(defn isolator-pedal [n]
  {:type :pedal
   :name (str "pedal" n)
   :distributor true
   :isolator true})

(deftest simplify
  (is (= {:power :distributor :name "pedal1"} (ptree/simplify (distributor-pedal 1))))
  (is (= {:power :isolator :name "pedal2"} (ptree/simplify (isolator-pedal 2)))))

(defn eql-zip [expected loc]
  (= expected (zip/root loc)))

(deftest insert
  (let [root (ptree/zipper)]
    (is (eql-zip [:distributor [:pedal "pedal1"]]
                 (ptree/insert root [:pedal "pedal1"])))
    (is (eql-zip [:distributor [:pedal "pedal1"] [:pedal "pedal2"] [:pedal "pedal3"] [:pedal "pedal4"] [:pedal "pedal5"] [:pedal "pedal6"]]
                 (-> root
                     (ptree/insert [:pedal "pedal1"])
                     (ptree/insert [:pedal "pedal2"])
                     (ptree/insert [:pedal "pedal3"])
                     (ptree/insert [:pedal "pedal4"])
                     (ptree/insert [:pedal "pedal5"])
                     (ptree/insert [:pedal "pedal6"]))))
    (is (eql-zip [:distributor [:pedal "pedal1"] [:pedal "pedal2"] [:pedal "pedal3"] [:pedal "pedal4"] [:pedal "pedal5"] [:distributor [:pedal "pedal6"] [:pedal "pedal7"]]]
                 (-> root
                     (ptree/insert [:pedal "pedal1"])
                     (ptree/insert [:pedal "pedal2"])
                     (ptree/insert [:pedal "pedal3"])
                     (ptree/insert [:pedal "pedal4"])
                     (ptree/insert [:pedal "pedal5"])
                     (ptree/insert [:pedal "pedal6"])
                     (ptree/insert [:pedal "pedal7"]))))
    (is (eql-zip [:distributor [:pedal "pedal1"] [:isolator [:pedal "pedal2"]]]
                 (-> root
                     (ptree/insert [:pedal "pedal1"])
                     (ptree/insert [:isolator [:pedal "pedal2"]]))))))

(deftest build
  (is (eql-zip [:distributor [:pedal "pedal1"] [:pedal "pedal2"] [:pedal "pedal3"] [:pedal "pedal4"] [:pedal "pedal5"] [:pedal "pedal6"]]
               (ptree/build (for [n (range 1 7)] (distributor-pedal n)))))
  (is (eql-zip [:distributor [:pedal "pedal1"] [:pedal "pedal2"] [:pedal "pedal3"] [:pedal "pedal4"] [:pedal "pedal5"] [:distributor [:pedal "pedal6"] [:pedal "pedal7"]]]
               (ptree/build (for [n (range 1 8)] (distributor-pedal n)))))
  (is (eql-zip [:distributor [:pedal "pedal1"] [:pedal "pedal2"] [:isolator [:pedal "pedal3"] [:pedal "pedal4"]]]
               (ptree/build [(distributor-pedal 1) (distributor-pedal 2) (isolator-pedal 3) (isolator-pedal 4)]))))
