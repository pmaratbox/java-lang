# 0035 — Ranges & Slicing

From the list `[10, 20, 30, 40, 50]`, take the sub-sequence at indices 1 through 4 (exclusive) and print `slice: 20 30 40`. `List.subList(1, 4)` returns a half-open *view* over the original list rather than a copy; structural changes made *through* the view write back to a mutable backing list. Here the source is an unmodifiable `List.of(...)`, so the view is read-only too — wrap it in `new ArrayList<>(...)` for a detached, mutable copy.

## Run

    javac Ranges.java && java Ranges
