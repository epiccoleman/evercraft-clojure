(ns evercraft-clojure.core-test
  (:use midje.sweet)
  (:use [evercraft-clojure.core]))


(facts "Character"
  (fact "has a name"
    (character "Pickles The Drummer") => { :name "Pickles The Drummer" }
))
