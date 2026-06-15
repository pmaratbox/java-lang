# 0470 — Boolean flag

Parse a boolean flag with picocli. This lesson declares a `--verbose` `@Option` mapped to a `boolean` field; presence of the flag sets it to `true`. For determinism the program parses a hardcoded argv `["--verbose"]` via `new CommandLine(cmd).parseArgs(...)` rather than the real process arguments, then prints the flag value as lowercase `true`. Uses the real `info.picocli:picocli` library.

## Run

    jbang BooleanFlag.java
