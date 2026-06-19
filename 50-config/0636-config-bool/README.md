# 0636 — Boolean value

Uses Typesafe Config (the HOCON/JSON configuration library, `com.typesafe:config`) to load `app.json` via `ConfigFactory.parseFile`, then reads the boolean key `debug` with `getBoolean("debug")` and prints it. Booleans render lowercase (`true`).

## Run

    jbang ConfigBool.java
