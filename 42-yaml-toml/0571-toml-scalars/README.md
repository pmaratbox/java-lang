# 0571 — TOML scalars

Uses the real [tomlj](https://github.com/tomlj/tomlj) library to parse a fixed TOML document with two top-level keys (`title` a string and `version` an integer), then prints the values space-joined. `getString` returns the string and `getLong` returns the integer, which prints plainly.

## Run

    jbang TomlScalars.java
