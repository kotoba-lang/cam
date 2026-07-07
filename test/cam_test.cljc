(ns cam-test
  "Sanity test for the root `cam` namespace. Per-submodule behavioural
  tests live in `cam.follow-test` / `cam.look-constraint-test` /
  `cam.shake-test` (test/cam/*_test.cljc)."
  (:require [clojure.test :refer [deftest is testing]]
            [cam]
            [cam.follow]
            [cam.look-constraint]
            [cam.shake]))

(deftest namespace-loads
  (testing "the cam namespace and its three submodules all load"
    (is (some? (the-ns 'cam)))
    (is (some? (the-ns 'cam.follow)))
    (is (some? (the-ns 'cam.look-constraint)))
    (is (some? (the-ns 'cam.shake)))))
