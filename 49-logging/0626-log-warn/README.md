# 0626 — Log at warn level

Uses the SLF4J 2 fluent logging API backed by Logback. A Logback `ListAppender` captures log events entirely in memory (the default console appender is detached first so nothing leaks to stdout). The program emits one WARN record with the message `low disk` via `log.atWarn().setMessage(..).log()`, then reads the captured event's level and message back out, normalizing the level to the short lowercase set (`WARN` -> `warn`) and printing the single line `warn|low disk`.

## Run

    jbang LogWarn.java
