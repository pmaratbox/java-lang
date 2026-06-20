# 0703 — Count unchanged lines

Uses the `java-diff-utils` library to diff two fixed line-lists
`A=[apple, banana, cherry]` and `B=[apple, blueberry, cherry, date]`.
Lines removed by `DELETE` (or `CHANGE`) deltas are collected from the source;
the unchanged (equal) count is `A.size() - removed.size()`, here the two
lines `apple` and `cherry`.

## Run

    jbang DiffUnchangedCount.java
