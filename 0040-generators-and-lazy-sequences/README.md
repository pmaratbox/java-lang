# 0040 — Generators & Lazy Sequences

Produce an endless lazy sequence of squares and take only the first three, printing `1 4 9`. Java's `Stream` is lazy: `Stream.iterate(1, n -> n + 1)` is infinite, `map` squares each element, and `limit(3)` takes the first three — the pipeline only runs when the terminal `collect` pulls values.

## Run

    javac Generators.java && java Generators
