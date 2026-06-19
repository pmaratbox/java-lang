# 0681 — Map

This lesson maps a function over a list with Vavr's persistent `io.vavr.collection.List` — calling its `.map(x -> x * 2)` transform over `[1, 2, 3]` and joining the result with `.mkString(",")`.

## Run

    jbang FpMap.java
