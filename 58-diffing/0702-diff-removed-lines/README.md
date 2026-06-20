# 0702 — Removed line content

Uses the `java-diff-utils` library to diff two fixed line-lists
`A=[apple, banana, cherry]` and `B=[apple, blueberry, cherry, date]`.
Each delta of type `DELETE` (or `CHANGE`) contributes its source lines to the
removed set; the program prints those removed lines (in A order), comma-joined.

## Run

    jbang DiffRemovedLines.java
