# 0018 — Closures

Build a counter that captures a private count starting at zero; each call to the returned function increments the count and returns it, so calling it twice prints 1 then 2. Java lambdas may only capture *effectively final* variables, so a plain `int count` could not be reassigned from inside one. The idiom is to capture a mutable container instead: a one-element `int[]` whose reference stays final while its contents change, and `++count[0]` updates the element. The lambda is returned as an `IntSupplier` and invoked with `getAsInt()`.

## Run

    javac Closures.java && java Closures
