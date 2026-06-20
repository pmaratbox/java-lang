# 0706 — All lines added

This lesson diffs two fixed line-lists with the `java-diff-utils` library (`com.github.difflib.DiffUtils.diff`). Diffing from an empty list `[]` to `[x, y]` means every line in the target is an insertion, so it walks the resulting `Patch` deltas, collects target lines from `INSERT` and `CHANGE` deltas as the added lines, and prints the added line count.

## Run

    jbang DiffAllAdded.java
