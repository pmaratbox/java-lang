# 0518 — Multiple arguments

Run a property programmatically with the real QuickTheories library. `qt().forAll(...)` accepts more than one generator: here it takes two `integers().all()` sources, so `.check((a, b) -> ...)` receives two independently generated integer arguments. The property asserts that `Math.max(a, b)` is at least `a` and at least `b`, which holds for every pair, so the check passes silently and `passed` is printed.

## Run

    jbang MultipleArgs.java
