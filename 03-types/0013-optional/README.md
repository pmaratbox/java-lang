# 0013 — Optional

Hold one value that is present (`42`) and one that is absent, then print each
with a fallback of `-1` when absent. `Optional<Integer>` wraps a possibly-absent
value — `Optional.of(...)` or `Optional.empty()` — and `.orElse(fallback)` reads
the value or substitutes the fallback.

## Run

    javac Optionals.java && java Optionals
