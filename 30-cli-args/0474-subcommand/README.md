# 0474 — Subcommand

Dispatch to a subcommand using the picocli library. This lesson defines an `add` subcommand (via picocli's `@Command` subcommands feature) that takes two integer positional parameters, sums them, and prints the result. To stay deterministic, the program parses a fixed hardcoded argv `["add", "2", "3"]` rather than the real process arguments, so running with no arguments always produces the same output. Uses the real `info.picocli:picocli` library.

## Run

    jbang Subcommand.java
