# 0634 — Nested key

Uses **typesafe-config** (the Lightbend HOCON/JSON config library) to parse the JSON file `app.json` via `ConfigFactory.parseFile`. The library exposes nested objects through dotted paths, so the nested integer `server.port` is read with `cfg.getInt("server.port")` and printed as `8080`.

## Run

    jbang ConfigNested.java
