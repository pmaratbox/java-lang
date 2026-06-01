# 0025 — Tuples & Multiple Return

Return both the smaller and larger of `3` and `7` from one function, unpacking the pair to print `min: 3` and `max: 7`. Java has no tuple type; a small immutable *record* (`record MinMax(int lo, int hi) {}`, Java 16+) names the two fields and is returned by value. Before records, a two-element array or a bespoke class served the same purpose.

## Run

    javac Tuples.java && java Tuples
