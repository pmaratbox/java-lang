# 0527 — Timezone offset

Using Java's `java.time` library, parse the fixed instant `2026-06-15T12:00:00Z` with `Instant.parse`, then convert it to a fixed `+05:00` offset via `atOffset(ZoneOffset.ofHours(5))` (a fixed-offset zone, not a named timezone or OS tzdata). The library computes the local hour `17` with `OffsetDateTime.getHour`.

## Run

    jbang TimezoneOffset.java
