# 0469 — Positional argument

Parse a positional argument with the real picocli library. This lesson defines a `@Parameters(index = "0")` field `name` and parses a fixed, hardcoded argv `["alice"]` via `new CommandLine(cmd).parseArgs(...)`. Using a hardcoded argv instead of the real process arguments keeps the output deterministic. Uses the real `info.picocli:picocli` library.

## Run

    jbang PositionalArgument.java
