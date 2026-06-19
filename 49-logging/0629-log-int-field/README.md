# 0629 — Log an integer field

Uses SLF4J 2's fluent logging API with Logback as the backend. An INFO record with the message `processed` and one structured integer field `count=5` is emitted via `log.atInfo().addKeyValue("count", 5)`. Instead of writing to the console, a Logback `ListAppender` captures the record in memory (after detaching the default console appender), and the program reads the level, formatted message, and key/value pairs to print one normalized line: `level|message` followed by each field sorted by key as `|key=value`. The integer value prints as-is.

## Run

    jbang LogIntField.java
