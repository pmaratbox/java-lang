# 0568 — Nested YAML mapping

Uses the SnakeYAML library (`org.yaml.snakeyaml`) to parse a fixed YAML
document containing a nested `server` mapping. The parser returns nested
`Map` objects; we read `server.host` and `server.port` and print them as
`host:port` -> `localhost:8080`. The values come from the library, never
hardcoded.

## Run

    jbang YamlNested.java
