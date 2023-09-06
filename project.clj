(defproject ring-oauth2 "0.2.2"
  :description "OAuth 2.0 client middleware for Ring"
  :url "https://github.com/weavejester/ring-oauth2"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [cheshire "5.11.0"]
                 [clj-http "3.12.3"]
                 [ring/ring-core "1.10.0"]]
  :profiles
  {:dev {:dependencies [[clj-http-fake "1.0.4"]
                        [ring/ring-mock "0.4.0"]]}})
