# 0684 — Chunk

Uses [vavr](https://vavr.io/)'s immutable `io.vavr.collection.List` and its `grouped(n)` transform to split `[1,2,3,4,5,6]` into fixed-size pieces of length 2. Each chunk is comma-joined with `mkString(",")` and the chunks are joined with `|`, producing `1,2|3,4|5,6`.

## Run

    jbang FpChunk.java
