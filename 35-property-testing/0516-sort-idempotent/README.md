# 0516 — Sort is idempotent

Check the idempotence law `sort(sort(xs)) == sort(xs)` with the real QuickTheories property-testing library. `lists().of(integers().all())` builds a generator of random integer lists, and `qt().forAll(gen).check(pred)` generates around 100 cases and evaluates the predicate on each — sorting an already-sorted list yields the same list, so the property holds universally. `check` throws an `AssertionError` only on a counterexample; since none exists here, the run falls through and prints `passed`. The check is run programmatically (not via a test runner).

## Run

    jbang SortIdempotent.java
