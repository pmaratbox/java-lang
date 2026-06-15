# 0523 — Difference in days

Using Java's `java.time` library, parse two fixed ISO dates with `LocalDate.parse`
and compute the number of days between them with `ChronoUnit.DAYS.between`. The
result is calculated by the library, not hardcoded.

## Run

    jbang DifferenceDays.java
