# 0431 — Concat Streams

Use the library's concat operator so the second stream starts only after the first completes. Built with Project Reactor's Flux.concat, which subscribes to the second Flux only after the first one completes.

## Run

    jbang ConcatStreams.java
