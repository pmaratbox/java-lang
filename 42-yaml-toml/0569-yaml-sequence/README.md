# 0569 — YAML sequence

Uses Java's real YAML library (*SnakeYAML*) to parse a fixed document containing
a `fruits` sequence (`apple`, `banana`, `cherry`). The parsed list is joined with
commas to produce `apple,banana,cherry` — the values come from the library's
parser, never hardcoded.

## Run

    jbang YamlSequence.java
