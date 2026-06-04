# 0331 — Transducer Pipeline

Compose map(+1) with filter(even) and run it over [1,2,3,4], printing `2 4`. Transducers wrap a reducing step, so `map(+1)` and `filter(even)` compose into one single-pass pipeline.

## Run

    javac TransducerPipeline.java && java TransducerPipeline
