# 0514 — Integer property

Check a property over generated integers with the real QuickTheories property-testing library. `qt().forAll(integers().all(), integers().all())` draws two integers from the built-in `integers()` generator, and `.check((a, b) -> a + b == b + a)` asserts that addition is commutative for each generated pair. The library runs ~1000 trials and throws an `AssertionError` if any counterexample is found; since the property always holds the check returns quietly and we print `passed`.

## Run

    jbang IntegerProperty.java
