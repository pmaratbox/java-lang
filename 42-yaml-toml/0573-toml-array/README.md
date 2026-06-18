# 0573 — TOML array

Uses the real TOML library [tomlj](https://github.com/tomlj/tomlj) to parse the
fixed document `tags = ["red", "green", "blue"]`. The `tags` array is read back
with `getArray("tags")`, its string elements are collected, and they are joined
with commas to print `red,green,blue` — the values come from the parser, never
hardcoded.

## Run

    jbang TomlArray.java
