# 0631 — Deterministic field order

Uses SLF4J 2's fluent logging API with a Logback `ListAppender` to capture the log record in memory (no real timestamp, nothing printed to the console). An INFO record `metric` is emitted with two structured key/value fields supplied in non-alphabetical order (`zeta=2` then `alpha=1`). When reading the captured event's `getKeyValuePairs()`, the fields are sorted by key, producing a deterministic normalized line.

## Run

    jbang LogFieldSorting.java
