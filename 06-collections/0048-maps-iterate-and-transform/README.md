# 0048 — Maps: Iterate & Transform

Build a map from letters to numbers (`a`->1, `b`->2, `c`->3), sum all its values, and print `sum: 6`. `Map.of` builds an immutable map, `values()` returns its value collection, and a stream's `mapToInt(...).sum()` folds them. `entrySet`, `keySet`, and `forEach` are the other traversals.

## Run

    javac MapTransform.java && java MapTransform
