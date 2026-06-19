# 0627 — Log at error level

Uses SLF4J 2's fluent logging API with a Logback backend to emit a single ERROR record carrying the message `boom`. The record is captured in-memory via a Logback `ListAppender` (the default console appender is detached first with `root.detachAndStopAllAppenders()`, so nothing leaks to stdout/stderr and there is no real timestamp in the output). The captured event's level is normalized to the lowercase short form and printed as `level|message`.

## Run

    jbang LogError.java
