# 0670 — Exact decimal multiplication

Uses `java.math.BigDecimal`, Java's exact base-10 decimal type, to multiply `1.1 * 1.1`. Unlike binary `double` (which yields `1.2100000000000002`), `BigDecimal` represents each value precisely, so `multiply` produces the exact result `1.21`.

## Run

    jbang DecimalMultiply.java
