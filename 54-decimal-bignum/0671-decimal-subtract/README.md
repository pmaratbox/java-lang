# 0671 — Exact decimal subtraction

Java's `java.math.BigDecimal` performs exact base-10 arithmetic, so subtracting `0.1` from `1.0` with `subtract` yields exactly `0.9` — no binary floating-point rounding error.

## Run

    jbang DecimalSubtract.java
