# 0572 — TOML table

Uses the real [tomlj](https://github.com/tomlj/tomlj) library to parse a fixed TOML document containing a `[server]` table with two fields (`host` a string and `port` an integer). The nested values are read back through dotted keys — `getString("server.host")` and `getLong("server.port")` — and printed as `host=<host> port=<port>`. The values are produced by the parser, never hardcoded.

## Run

    jbang TomlTable.java
