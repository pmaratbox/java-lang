# 0049 — Zip & Enumerate

Pair the letters `a, b, c` with the numbers `1, 2, 3` position by position, formatting each pair as `key=value` and printing `a=1 b=2 c=3`. Java has no `zip`; `IntStream.range(0, n)` generates indices that `mapToObj` uses to read both lists. The index stream is the usual way to walk parallel lists.

## Run

    javac Zip.java && java Zip
