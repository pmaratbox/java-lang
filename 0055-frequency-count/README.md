# 0055 — Frequency Count

Count how many times each letter appears in `banana` and print the per-letter counts in alphabetical order: `a:3 b:1 n:2`. A `TreeMap` keeps keys sorted; `merge(ch, 1, Integer::sum)` increments the count (inserting `1` when absent), and `entrySet()` iterates alphabetically.

## Run

    javac FrequencyCount.java && java FrequencyCount
