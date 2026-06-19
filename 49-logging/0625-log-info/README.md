# 0625 — Log at info level

Uses SLF4J 2's fluent logging API backed by Logback. A Logback `ListAppender` captures log events in memory (after `detachAndStopAllAppenders()` removes the default console appender so nothing leaks to stdout), so there is no real timestamp in the output. We emit one INFO record with the message `service started` and no structured fields, read the captured event's level (`INFO` normalized to `info`) and formatted message, and print the normalized line.

## Run

    jbang LogInfo.java
