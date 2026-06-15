# 0517 — Custom generator

Build a custom generator and check a property over it using the real QuickTheories property-testing library. The base `integers().all()` source is transformed with the `map` combinator (`n -> n * 2`) to produce a derived generator that only yields even integers. `qt().forAll(gen).check(pred)` then feeds many generated values into the predicate `n % 2 == 0`. Because every value the generator produces is even, the property holds universally and the check passes silently (it would throw a clean `AssertionError` only on a counterexample), so the program prints `passed`.

## Run

    jbang CustomGenerator.java
