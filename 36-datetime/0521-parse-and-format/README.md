# 0521 — Parse & format

Uses the standard `java.time` library: `LocalDate.parse` reads the fixed ISO
date `2026-06-15`, then a `DateTimeFormatter.ofPattern("yyyy-MM-dd")` renders
it back to its ISO `yyyy-MM-dd` form. No current-time calls are used.

## Run

    jbang ParseAndFormat.java
