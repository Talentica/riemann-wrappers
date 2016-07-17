# Riemann-CloudWatch

## Pre-Requisite

1. Java >= 1.7
2. Riemann 2.11
3. Access to AWS via Role or Access Credentials


## Description

In order to forward the Riemann events to AWS CloudWatch, Riemann provides  `(cloudwatch {})` function.

## Usage

In case of Access Credentials

```
(cloudwatch {
  :access-key  "AWS access key of your AWS Account"
  :secret-key  "AWS secret key for the above access key"
  :endpoint    "AWS Endpoint for posting metrics(changes with AWS region)"
  :namespace   "AWS CloudWatch namespace"

  })
```

In case of IAM Role

```
(cloudwatch {
  :endpoint    "AWS Endpoint for posting metrics(changes with AWS region)"
  :namespace   "AWS CloudWatch namespace"

  })
```

IAM Policy for Role

Following policy should be applied to role to allow Riemann to send event to Cloudwatch.

[ cloudwatch_riemann_policy.json ](cloudwatch_riemann_policy.json)
