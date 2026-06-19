# 0640 — Read a section

Uses **typesafe-config** (the Lightbend HOCON/JSON config library) to parse the JSON file `app.json` via `ConfigFactory.parseFile`. Multiple keys are read from the `server` section through dotted paths — `server.host` with `getString` and `server.port` with `getInt` — and combined into `host:port`, printing `0.0.0.0:8080`.

## Run

    jbang ConfigSection.java
