# 0430 — Merge Streams

Use the library's merge operator on a virtual/test scheduler to interleave two timed streams by emission time. Built with Project Reactor's `Flux.merge` driven by a `VirtualTimeScheduler`.

## Run

    jbang MergeStreams.java
