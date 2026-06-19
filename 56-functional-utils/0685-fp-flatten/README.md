# 0685 — Flatten

This lesson uses [vavr](https://www.vavr.io/)'s immutable `io.vavr.collection.List` and its
`flatMap` transform to flatten a list of lists one level deep — `[[1,2],[3,4],[5,6]]` becomes
`[1,2,3,4,5,6]` — then joins the elements with `mkString(",")`.

## Run

    jbang FpFlatten.java
