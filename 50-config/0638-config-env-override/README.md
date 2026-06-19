# 0638 — Env override

Uses Typesafe Config (the HOCON/JSON configuration library, `com.typesafe:config`) to load `app.json` via `ConfigFactory.parseFile`, then merges `ConfigFactory.systemProperties()` with HIGHER priority via `withFallback`. Because the JVM cannot set its own environment variables, the lesson sets a system property `name=from-env` in-process, which overrides the file's `name` value. It prints the resolved `name`.

## Run

    jbang ConfigEnvOverride.java
