# 0434 — FlatMap (mergeMap)

Use the library's flatMap/mergeMap on a virtual/test scheduler, mapping each outer value to a timed inner stream and merging them. Project Reactor's Flux.flatMap merges the inner Fluxes, with timing driven by VirtualTimeScheduler.

## Run

    jbang FlatmapStreams.java
