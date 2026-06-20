# 0699 — Count added lines

This lesson diffs two fixed line-lists with the `java-diff-utils` library (`com.github.difflib.DiffUtils.diff`). It walks the resulting `Patch` deltas, collecting target lines from `INSERT` and `CHANGE` deltas as the added lines, then prints the added line count.

## Run

    jbang DiffAddedCount.java
