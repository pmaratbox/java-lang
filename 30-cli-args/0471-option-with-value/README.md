# 0471 — Option with value

Parse a value-bearing option with picocli, java's annotation-driven CLI parsing library. This lesson declares an `@Option(names = "--name")` bound to a string field and calls `CommandLine.parseArgs` on a hardcoded argv `["--name", "alice"]` rather than the real process arguments, so the program is deterministic and always prints the same value. Uses the real `info.picocli:picocli` library.

## Run

    jbang OptionWithValue.java
