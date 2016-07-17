
;; Webhook URL : https://hooks.slack.com/services/Q02MS69PT/C1MYL6ZUR/UqIC3SHnITjXHaOsICxRpBB8
;;Token : UqIC3SHnITjXHaOsICxRpBB8 (It is the last part of the webhook URI)

(def credentials {:account "accountname", :token "UqIC3SHnITjXHaOsICxRpBB8"})



(defn slack-format
        [event]
        (str "Service " (:service event) " on host " (:host event) " is in state " (:state event) ".\n"))



(def slacker
        "Send notifications to Slack"
        (slack credentials {:username "riemann-bot"
        :channel "#channel"
        :formatter (fn [e] { :text (slack-format e)
        } )
        :icon ":sos:"}))
