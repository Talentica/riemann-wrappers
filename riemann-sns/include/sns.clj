(def snsalert (sns-publisher {:access-key "<access-key>"
                            :secret-key "<secret-key>"
                            :arn "arn:aws:sns:<region>:<account>:<topic>"
                            :region "<region>"
                            :subject    "Spread your Wings"
                              }))
