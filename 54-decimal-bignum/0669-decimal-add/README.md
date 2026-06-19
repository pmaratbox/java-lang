# 0669 — Exact decimal addition

Uses `java.math.BigDecimal`, Java's exact base-10 decimal type, to add `0.1 + 0.2`. Unlike binary `double` (which yields `0.30000000000000004`), `BigDecimal` represents each value precisely, so `add` produces the exact result `0.3`.

## Run

    jbang DecimalAdd.java
