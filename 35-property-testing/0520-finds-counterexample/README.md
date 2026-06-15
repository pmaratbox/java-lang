# 0520 — Finds a counterexample

Detect a failing property with the real QuickTheories library, run programmatically rather than through a test runner. The property "every non-negative integer is `< 100`" is densely false, so `qt().forAll(integers().between(0, 1_000_000)).check(...)` generates inputs, finds a counterexample, and throws an `AssertionError`. Catching that error means a counterexample was found, and the library's falsifying-example / shrink report is suppressed (by swapping `System.out` for a discarding stream during the check) so only `found` is printed.

## Run

    jbang FindsCounterexample.java
