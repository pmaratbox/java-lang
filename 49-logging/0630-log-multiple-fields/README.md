# 0630 — Log multiple fields

Uses **SLF4J 2**'s fluent logging API on top of **Logback** to emit a single INFO record `request` carrying two structured key/value fields: a string `method=GET` and an integer `status=200`. The record is captured in-memory by a Logback `ListAppender` (after `detachAndStopAllAppenders()` removes the default console appender, so nothing leaks to stdout). We then read the captured event's level, formatted message, and `getKeyValuePairs()`, normalize the level to the short lowercase set, sort the fields by key, and print one normalized line: `info|request|method=GET|status=200`.

## Run

    jbang LogMultipleFields.java
