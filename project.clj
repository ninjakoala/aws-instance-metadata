(defproject com.ninjakoala/aws-instance-metadata "1.0.1-SNAPSHOT"
  :description "Handles querying local instance metadata in EC2 instances"
  :url "https://github.com/ninjakoala/instance-metadata"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[cheshire "5.6.1"]
                 [clj-http "3.1.0"]
                 [com.cemerick/url "0.1.1"]
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [org.tobereplaced/lettercase "1.0.0"]]
  :profiles {:dev {:dependencies [[midje "1.8.3"]]
                   :plugins [[lein-midje "3.2"]]}}
  :plugins [[lein-release "1.0.5"]]
  :lein-release {:deploy-via :clojars})
