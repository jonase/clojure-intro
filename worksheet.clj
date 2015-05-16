;; gorilla-repl.fileformat = 1

;; **
;;; # Introduction to Clojure
;;; 
;;; * `Shift+enter` evaluates code. 
;;; * Hit `ctrl+g` twice in quick succession or click the menu icon (upper-right corner) for more commands.
;;; 
;; **

;; @@
;; This is a "namespace declaration" where we pull in libraries we will use
(ns clojure-intro
  (:require 
    [clojure.repl :refer (doc)]
    [clojure.pprint :refer (pprint)]
    [clojure.string :as string]
    [clojure.data.csv :as csv]
    [gorilla-plot.core :as plot]
    [medley.core :as medley]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@

;; @@
