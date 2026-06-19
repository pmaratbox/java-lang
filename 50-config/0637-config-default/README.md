# 0637 — Default for missing key

Uses Typesafe Config (the HOCON/JSON configuration library, `com.typesafe:config`) to load `app.json` via `ConfigFactory.parseFile`. The key `missing` is not in the file, so a fallback config built with `ConfigFactory.parseMap(Map.of("missing", "fallback"))` supplies the default via `withFallback`, and `getString("missing")` resolves to `fallback`.

## Run

    jbang ConfigDefault.java
