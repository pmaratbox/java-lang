# 0098 — Memoization

Compute `fibonacci(10)` recursively with memoization (caching each result so it is computed once) and print it: `55`. A `HashMap` field caches results; `containsKey` short-circuits the recursion on a hit.

## Run

    javac Memoization.java && java Memoization
