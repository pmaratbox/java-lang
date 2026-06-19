# 0632 — Level filtering

Uses SLF4J 2's fluent logging API with a Logback backend to demonstrate level filtering. The root logger's minimum level is set to `WARN`, so an INFO record (`hidden`) is dropped before it ever reaches an appender, while a WARN record (`visible`) is kept. The default console appenders are detached and a `ListAppender<ILoggingEvent>` captures surviving records in memory (no real timestamp). Each captured event's level is normalized to the short lowercase set and printed as one normalized line, confirming only the warn record was retained.

## Run

    jbang LogLevelFilter.java
