(ns gigrig.powertree-test
  (:require [cljs.test :refer-macros [deftest is testing]]
            [gigrig.powertree :as ptree]))

(deftest simplify
  (is (= {:type :distributor} (ptree/simplify {:distributor true :isolator false})))
  (is (= {:type :isolator} (ptree/simplify {:distributor true :isolator true}))))
