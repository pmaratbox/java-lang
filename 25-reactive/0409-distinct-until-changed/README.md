# 0409 — Distinct Until Changed

Implement distinctUntilChanged, dropping consecutive duplicate values from 1,1,2,2,2,3,1. A small Observer carries the last forwarded value and uses equals to skip runs of duplicates.

## Run

    javac DistinctUntilChanged.java && java DistinctUntilChanged
