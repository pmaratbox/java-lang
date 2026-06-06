# 0433 — Zip Streams

Use the library's zip operator to pair two streams by index and combine each pair as a+b. Project Reactor's `Flux.zip(a, b, combiner)` pairs the two Flux sources by index and applies the combiner.

## Run

    jbang ZipStreams.java
