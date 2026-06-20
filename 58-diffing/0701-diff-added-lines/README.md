# 0701 — Added line content

Uses the *java-diff-utils* library (`com.github.difflib.DiffUtils`) to diff two
fixed line-lists `A=[apple, banana, cherry]` and `B=[apple, blueberry, cherry,
date]`. The deltas are walked and the lines from every `INSERT`/`CHANGE` target
are collected as the *added* lines, printed in document (B) order and
comma-joined to `blueberry,date`. The diff is computed by the library, never
hardcoded.

## Run

    jbang DiffAddedLines.java
