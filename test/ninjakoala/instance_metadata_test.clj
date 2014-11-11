(ns ninjakoala.instance-metadata-test
  (:require [clj-http.client :as http]
            [midje.sweet :refer :all]
            [ninjakoala.instance-metadata :refer :all]))

(fact "that we successfully pull in instance identity from the right URL"
      (instance-identity) => {:some "json"}
      (provided
       (http/get "http://169.254.169.254/latest/dynamic/instance-identity/document" {:conn-timeout 1000 :socket-timeout 1000}) => {:body "{\"some\":\"json\"}"
                                                                                                                                   :status 200}))

(fact "that we give back nil on a failure retrieving instance identity"
      (instance-identity) => nil
      (provided
       (http/get "http://169.254.169.254/latest/dynamic/instance-identity/document" {:conn-timeout 1000 :socket-timeout 1000}) =throws=> (ex-info "Busted" {})))
