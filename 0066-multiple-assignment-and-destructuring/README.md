# 0066 — Multiple Assignment & Destructuring

Swap two variables (`a = 1`, `b = 2`) with a single multiple-assignment, then unpack the pair `(3, 4)` into two variables — printing `2 1` then `3 4`. Java has no multiple assignment (a swap needs a temporary), but record patterns (Java 21+) deconstruct a record in `instanceof`/`switch` — `pair instanceof Pair(int x, int y)`.

## Run

    javac Destructuring.java && java Destructuring
