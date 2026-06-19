# 0672 — Exact decimal comparison

Uses `java.math.BigDecimal`, Java's exact base-10 decimal type, to test whether `0.1 + 0.2` equals `0.3`. With binary `double` this is `false` (the sum is `0.30000000000000004`), but `BigDecimal` is exact. The comparison uses `compareTo() == 0`, which ignores scale, rather than `equals()`, which also considers scale — so the result is `true`.

## Run

    jbang DecimalCompare.java
