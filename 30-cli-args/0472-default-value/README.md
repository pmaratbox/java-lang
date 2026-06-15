# 0472 — Default value

Use an option's default when it is absent. This lesson uses picocli's `@Option(defaultValue = "1")` to declare an integer `--count` option, then parses a hardcoded empty argv (`parseArgs()` with no arguments) so the output is deterministic. Because `--count` is never supplied, picocli falls back to the declared default and the program prints `1`. Uses the real `info.picocli:picocli` library.

## Run

    jbang DefaultValue.java
