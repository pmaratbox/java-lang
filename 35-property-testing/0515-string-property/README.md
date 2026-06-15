# 0515 — String property

Check a property over generated strings using the real QuickTheories property-testing library. The `strings().allPossible().ofLengthBetween(0, 50)` generator produces many strings, and `qt().forAll(gen).check(pred)` verifies the predicate against each — that the length of `s + s` equals `2 * len(s)`. Because the property holds universally, the check passes silently (it would throw a clean `AssertionError` only on a counterexample), so the program prints `passed`.

## Run

    jbang StringProperty.java
