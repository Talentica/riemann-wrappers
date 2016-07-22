# Reimann-Collectd


## Pre-Requisite

1. Collectd Installed with Protocol Buffer

```
sudo yum install collectd protobuf-c collectd-write_riemann
```

## Description

* Collectd with version `5.3` provides facility to write data to riemann.

## Usage

* Collectd can readily send data, once the plugin configuration is done in `collectd.conf`

```
LoadPlugin write_riemann
<Plugin write_riemann>
        <Node "172.28.128.3">
                Host "172.28.128.3"
                Port 5555
                Protocol TCP
                StoreRates false
                TTLFactor 3.0
                CheckThresholds true
        </Node>
        Tag "collectd"
</Plugin>
```
