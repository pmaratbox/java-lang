# 0020 — Pattern Matching

Match `n` against the literal patterns `1` and `2` with a wildcard fallback, mapping `1`, `2`, and `5` to `one`, `two`, and `many`. This uses a `switch` *expression* (Java 14+) with arrow (`->`) labels: each arm yields a value, there is no fall-through, and the whole `switch` evaluates to the returned `String`. The older statement form used `case ... :` with explicit `break`.

## Run

    javac PatternMatching.java && java PatternMatching
