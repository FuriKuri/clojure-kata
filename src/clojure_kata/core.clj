(ns clojure-kata.core
  (:use [ring.adapter.jetty :only [run-jetty]]))

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello, world!"})

(defn -main [port]
  (run-jetty app {:port (Integer. port)}))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
