# Reimann-Slack


## Pre-Requisite

1. Slack Channel Webhook

## Description

* Riemann `2.11` provides API to communicate with the Slack communication platform.

## Usage

* In order to post the alerts/updates to your Slack channel via Slack API, Riemann requires following things for Authentication and Authorization

1. Slack Account Name : Slack Account name is name of your organization registered with Slack.
2. Slack Webhook Token : Token is the last context of your Slack Webhook URI


```
#Lets say your Webhook URI is https://hooks.slack.com/services/Q02MS69PT/C1MYL6ZUR/UqIC3SHnITjXHaOsICxRpBB8

# Token of the above URI would be UqIC3SHnITjXHaOsICxRpBB8
```
