# 0628 — Log a string field

Uses SLF4J 2's fluent logging API with a Logback backend to emit an INFO record `login` carrying one structured string field `user=alice`. Instead of writing to the console, the root logger's default appenders are detached and a `ListAppender<ILoggingEvent>` captures records in memory (no real timestamp). The captured event's level, formatted message, and key/value pairs are read back, the level is normalized to the short lowercase set, fields are sorted by key, and one normalized line is printed.

## Run

    jbang LogStringField.java
