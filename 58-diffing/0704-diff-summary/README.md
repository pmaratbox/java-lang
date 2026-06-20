# 0704 — Diff summary

Uses the `java-diff-utils` library to diff two fixed line-lists
`A=[apple, banana, cherry]` and `B=[apple, blueberry, cherry, date]`.
Each delta of type `INSERT`/`CHANGE` contributes its target lines to the added
set and each `DELETE`/`CHANGE` contributes its source lines to the removed set;
unchanged is `A.size() - removed`. The program prints
`<added> <removed> <unchanged>` space-joined.

## Run

    jbang DiffSummary.java
