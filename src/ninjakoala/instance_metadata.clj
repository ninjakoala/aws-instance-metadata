(ns ninjakoala.instance-metadata
  (:require [cemerick.url :refer [url]]
            [cheshire.core :as json]
            [clj-http.client :as http]
            [clojure.tools.logging :refer [warn]]
            [org.tobereplaced.lettercase :as lc]))

(def ^:private base-url
  "http://169.254.169.254")

(def ^:private version
  "latest")

(def ^:private http-options
  {:conn-timeout 1000 :socket-timeout 1000})

(defn- build-url
  [path]
  (str (url base-url version path)))

(defn- request-metadata
  [path]
  (try
    (let [{:keys [body status]} (http/get (build-url path) http-options)]
      (when (= status 200)
        body))
    (catch Exception e
      (warn e "Failed to retrieve instance metadata")
      nil)))

(defn instance-identity
  []
  (when-let [document (request-metadata "dynamic/instance-identity/document")]
    (json/parse-string document lc/lower-hyphen-keyword)))
