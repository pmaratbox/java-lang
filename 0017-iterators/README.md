# 0017 — Iterators

Take the numbers 1 through 5, keep the even ones, double each, and add them up — a filter, then a map, then a reduce — printing the final sum. Java's Stream API drives the pipeline: `stream()` opens it, `filter` and `map` are lazy intermediate operations, and a *terminal* operation runs it. Switching to `mapToInt` produces an `IntStream`, which offers a primitive `sum()` directly — avoiding boxing and a more verbose `reduce(0, Integer::sum)`.

## Run

    javac Iterators.java && java Iterators
