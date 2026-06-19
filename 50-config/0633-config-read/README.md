# 0633 — Read a value

Uses Typesafe Config (the HOCON/JSON configuration library, `com.typesafe:config`) to load `app.json` via `ConfigFactory.parseFile`, then reads the top-level string key `name` with `getString("name")` and prints it.

## Run

    jbang ConfigRead.java
