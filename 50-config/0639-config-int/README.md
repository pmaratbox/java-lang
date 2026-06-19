# 0639 — Integer value

Uses the Typesafe Config library (`com.typesafe:config`, HOCON/JSON) to load the fixed `app.json` config file via `ConfigFactory.parseFile`. The program reads the integer field `retries` with `getInt("retries")` and prints the extracted value `3`.

## Run

    jbang ConfigInt.java
