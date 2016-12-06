# Diamond-Riemann


## Pre-Requisite

1. Diamond Collector
2. Riemann
3. [Python Bernhard](https://pypi.python.org/pypi/bernhard) module should be installed.

## Description

1. Add the following handler in the `handlers` variable.

```
handlers = diamond.handler.graphite.GraphiteHandler, diamond.handler.archive.ArchiveHandler, diamond.handler.riemann.RiemannHandler
```

2. Add the `RiemannHandler` section to provide Riemann environment details.

```
[[RiemannHandler]]
host  = 127.0.0.1
port  = 5555
```

Please refer [diamond](diamond.conf) for reference.
