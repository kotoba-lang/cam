(ns cam-test
  (:require [clojure.test :refer [deftest is testing]]
            [cam]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? cam))))
