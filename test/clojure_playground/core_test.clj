(ns clojure-playground.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [clojure-playground.core :refer [add]]))

(deftest add-test
  (testing "adding two numbers"
    (is (= (add 0 1) 1))))
