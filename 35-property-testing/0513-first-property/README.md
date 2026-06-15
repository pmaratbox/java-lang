# 0513 — First property

Run a property programmatically with the real QuickTheories library. `qt().forAll(...)` draws inputs from a generator and `.check(pred)` evaluates the predicate over roughly 100 generated examples, throwing an `AssertionError` if it ever finds a counterexample. The generator here is `lists().of(integers().all()).ofSizeBetween(0, 20)`, and the property asserts that reversing a list twice yields the original list. Because the property always holds, the check passes silently and `passed` is printed.

## Run

    jbang FirstProperty.java
