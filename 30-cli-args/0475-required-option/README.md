# 0475 — Required option

Declare a CLI option as required. This lesson uses picocli's `@Option(names = "--id", required = true)` annotation to mark the integer option `--id` as mandatory, then parses the hardcoded argv `["--id", "42"]` via `new CommandLine(opts).parseArgs(...)` for deterministic output. picocli would raise a `MissingParameterException` if the required option were absent. Uses the real `info.picocli:picocli` library.

## Run

    jbang RequiredOption.java
