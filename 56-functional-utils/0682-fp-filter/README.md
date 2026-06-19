# 0682 — Filter

Uses vavr's persistent `io.vavr.collection.List` and its `filter` transform to keep only the elements that satisfy a predicate. Here we filter the even numbers out of `[1..6]`, then `mkString(",")` joins them into a comma-separated string.

## Run

    jbang FpFilter.java
