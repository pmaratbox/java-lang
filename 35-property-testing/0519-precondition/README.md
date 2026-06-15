# 0519 — Precondition / filter

Constrain generated inputs with a precondition using the real QuickTheories property-testing library. `qt().forAll(integers().between(0, 1000000))` generates integers, and `.assuming(n -> n > 0)` is the library's precondition combinator that discards non-positive cases so only positive values reach the property `n + 1 > n`, which is then checked over the generated inputs with `.check(...)`. The check runs programmatically (not via a test runner) and throws an `AssertionError` only on failure; since the property holds, it returns cleanly and `passed` is printed.

## Run

    jbang Precondition.java
