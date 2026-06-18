# 0574 — TOML array of tables

Uses the real [tomlj](https://github.com/tomlj/tomlj) library to parse a TOML array of tables (`[[servers]]`). The document declares two `servers` entries; we read the `servers` array, pull each table's `name`, and join them with commas to print `alpha,beta`.

## Run

    jbang TomlArrayOfTables.java
