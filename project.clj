(defproject com.ninjakoala/aws-instance-metadata "1.0.3-SNAPSHOT"
  :description "Handles querying local instance metadata in EC2 instances"
  :url "https://github.com/ninjakoala/aws-instance-metadata"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[cheshire "5.7.1"]
                 [clj-http "3.6.1"]
                 [com.cemerick/url "0.1.1"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.4.0"]
                 [org.tobereplaced/lettercase "1.0.0"]]
  :profiles {:dev {:dependencies [[midje "1.8.3"]]
                   :plugins [[lein-midje "3.2.1"]]}}
  :aliases {"test" ["midje"]}
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["vcs" "commit"]
                  ["vcs" "tag" "--no-sign"]
                  ["deploy" "clojars"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push"]])
