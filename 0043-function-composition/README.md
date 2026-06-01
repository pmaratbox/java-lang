# 0043 — Function Composition

Compose `inc` (add one) and `twice` (multiply by two) into one function and apply it to `3`, so `inc(twice(3))` prints `7`. `java.util.function.Function` has composition built in: `inc.compose(twice)` returns a function that runs `twice` then `inc` (`andThen` is the reverse order). No helper needs to be written.

## Run

    javac FunctionComposition.java && java FunctionComposition
