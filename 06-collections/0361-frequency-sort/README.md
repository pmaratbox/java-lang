# 0361 — Frequency Sort

Sort [1,1,2,3,3,3] by descending frequency (ties keep first-seen order), printing `3 3 3 1 1 2`. A `LinkedHashMap` counts via `merge`, then a stable `sorted` by count desc re-emits each value as many times as it occurred.

## Run

    javac FrequencySort.java && java FrequencySort
