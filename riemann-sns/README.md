# Riemann-SNS

## Pre-Requisite

1. Java >= 1.7
2. Riemann 2.11
3. Access to AWS via Role or Access Credentials


## Description

In order to forward the Riemann events to AWS SNS Topic, Riemann provides  `(sns-publisher {})` function.

## Usage

In case of Access Credentials

```
(sns-publisher {
  :access-key  "AWS access key of your AWS Account"
  :secret-key  "AWS secret key for the above access key"
  :region      "AWS Region"
  :arn         "AWS SNS Topic ARN"
  })
```

In case of IAM Role

```
(sns-publisher {
  :region      "AWS Region"
  :arn         "AWS SNS Topic ARN"
  })
```

IAM Policy for Role

Following policy should be applied to role to allow Riemann to send event to SNS.

[ sns_riemann_policy.json ](sns_riemann_policy.json)
