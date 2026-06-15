# 0526 — Add time

Using Java's `java.time` library, parse the fixed datetime `2026-06-15T10:00` with `LocalDateTime.parse`, add 90 minutes via `plusMinutes(90)`, and format the result as `HH:mm` with `DateTimeFormatter`. The library computes the rollover from `10:00` to `11:30`.

## Run

    jbang AddTime.java
