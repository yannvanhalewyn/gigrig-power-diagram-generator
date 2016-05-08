(ns gigrig.powertree-test
  (:require [cljs.test :refer-macros [deftest is testing]]
            [clojure.zip :as zip]
            [gigrig.zipper :as gzip]
            [gigrig.powertree :as ptree]))

;; HELPERS
;; =======
(defn echo [arg]
  (.log js/console arg)
  arg)

(defn distributor-pedal [n]
  {:type :pedal
   :name (str "pedal" n)
   :distributor true})

(defn distributor-pedals [n]
  (for [i (range 1 (inc n))]
    (distributor-pedal i)))

(defn isolator-pedal [n]
  {:type :pedal
   :name (str "pedal" n)
   :distributor true
   :isolator true})

(defn isolator-pedals
  ([n] (isolator-pedals 1 n))
  ([from to] (for [i (range from (inc to))]
               (isolator-pedal i))))

(deftest simplify
  (is (= {:power :distributor :name "pedal1"} (ptree/simplify (distributor-pedal 1))))
  (is (= {:power :isolator :name "pedal2"} (ptree/simplify (isolator-pedal 2)))))

(defn eql-zip [expected loc]
  (= expected (zip/root loc)))

(deftest insert
  (let [root (gzip/zipper)]
    (is (eql-zip [:distributor [[:pedal "pedal1"]] nil]
                 (ptree/insert root [:pedal "pedal1"])))
    (is (eql-zip [:distributor [[:pedal "pedal1"] [:pedal "pedal2"] [:pedal "pedal3"] [:pedal "pedal4"] [:pedal "pedal5"] [:pedal "pedal6"]] nil]
                 (-> root
                     (ptree/insert [:pedal "pedal1"])
                     (ptree/insert [:pedal "pedal2"])
                     (ptree/insert [:pedal "pedal3"])
                     (ptree/insert [:pedal "pedal4"])
                     (ptree/insert [:pedal "pedal5"])
                     (ptree/insert [:pedal "pedal6"]))))
    (is (eql-zip [:distributor [[:pedal "pedal1"] [:pedal "pedal2"] [:pedal "pedal3"] [:pedal "pedal4"] [:pedal "pedal5"] [:distributor [[:pedal "pedal6"] [:pedal "pedal7"]] nil]] nil]
                 (-> root
                     (ptree/insert [:pedal "pedal1"])
                     (ptree/insert [:pedal "pedal2"])
                     (ptree/insert [:pedal "pedal3"])
                     (ptree/insert [:pedal "pedal4"])
                     (ptree/insert [:pedal "pedal5"])
                     (ptree/insert [:pedal "pedal6"])
                     (ptree/insert [:pedal "pedal7"]))))
    (is (eql-zip [:distributor [[:pedal "pedal1"] [:isolator [:pedal "pedal2"]]] nil]
                 (-> root
                     (ptree/insert [:pedal "pedal1"])
                     (ptree/insert [:isolator [:pedal "pedal2"]]))))))

(deftest build
  (is (eql-zip [:distributor [[:pedal "pedal1"] [:pedal "pedal2"] [:pedal "pedal3"] [:pedal "pedal4"] [:pedal "pedal5"] [:pedal "pedal6"]] nil]
               (ptree/build (distributor-pedals 6))))
  (is (eql-zip [:distributor [[:pedal "pedal1"] [:pedal "pedal2"] [:pedal "pedal3"] [:pedal "pedal4"] [:pedal "pedal5"] [:distributor [[:pedal "pedal6"] [:pedal "pedal7"]] nil]] nil]
               (ptree/build (distributor-pedals 7))))
  (is (eql-zip [:distributor [[:pedal "pedal1"] [:pedal "pedal2"] [:isolator [[:pedal "pedal3"] [:pedal "pedal4"]]]] nil]
               (ptree/build [(distributor-pedal 1) (distributor-pedal 2) (isolator-pedal 3) (isolator-pedal 4)])))
  (is (eql-zip [:distributor [[:pedal "pedal7"]
                              [:isolator [[:pedal "pedal1"]
                                          [:pedal "pedal2"]
                                          [:pedal "pedal3"]
                                          [:pedal "pedal4"]]]
                              [:isolator [[:pedal "pedal5"]
                                          [:pedal "pedal6"]]]] nil]
               (ptree/build (cons (distributor-pedal 7) (isolator-pedals 6)))))
  (is (eql-zip [:distributor [[:pedal "pedal1"] [:pedal "pedal2"] [:pedal "pedal3"] [:pedal "pedal4"] [:pedal "pedal5"] [:isolator [[:pedal "pedal6"] [:pedal "pedal7"]]]] nil]
               (ptree/build (concat (distributor-pedals 5) (isolator-pedals 6 7))))))
