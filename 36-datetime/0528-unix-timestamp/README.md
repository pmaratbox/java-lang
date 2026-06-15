# 0528 — Unix Timestamp

Compute the Unix timestamp (epoch seconds) of the fixed UTC instant `2026-06-15T00:00:00Z` using `java.time`. An `OffsetDateTime` built with `ZoneOffset.UTC` is converted to an `Instant`, whose `getEpochSecond()` returns the seconds since the Unix epoch (`1970-01-01T00:00:00Z`) — no OS timezone database involved.

## Run

    jbang UnixTimestamp.java
