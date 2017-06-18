[![Clojars Project](https://img.shields.io/clojars/v/com.ninjakoala/aws-instance-metadata.svg)](https://clojars.org/com.ninjakoala/aws-instance-metadata) [![Build Status](https://travis-ci.org/ninjakoala/aws-instance-metadata.svg?branch=master)](https://travis-ci.org/ninjakoala/aws-instance-metadata)

```clojure
(ns yourapp
  (:require [ninjakoala.instance-metadata :as im]))

(:account-id (im/instance-identity))
; => your-aws-account-id
```

# aws-instance-metadata

Provides a wrapper to retrieve [EC2 instance metadata](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html).

## License

Copyright © 2014 Neil Prosser

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
