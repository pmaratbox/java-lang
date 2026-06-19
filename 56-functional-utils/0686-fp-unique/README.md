# 0686 — Unique

Uses [vavr](https://vavr.io/)'s immutable `io.vavr.collection.List` and its `distinct()` transform to remove duplicates from `[1,2,2,3,3,3]` while preserving first-seen order. The deduplicated list is comma-joined with `mkString(",")`, producing `1,2,3`.

## Run

    jbang FpUnique.java
