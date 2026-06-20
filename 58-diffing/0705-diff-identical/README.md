# 0705 — Identical inputs

This lesson diffs a fixed line-list against itself with the `java-diff-utils` library (`com.github.difflib.DiffUtils.diff`). Because both lists are identical, the resulting `Patch` carries no deltas, so the added and removed line collections stay empty. It prints `<added> <removed>` — both zero.

## Run

    jbang DiffIdentical.java
