# 0473 — Multiple values

Collect a repeated `--num` option into a `List<Integer>` using picocli's `@Option`, which accumulates each occurrence of a multi-valued option into the annotated collection. This lesson parses a fixed hardcoded argv (`--num 1 --num 2 --num 3`) instead of the real process arguments so the output is deterministic, then sums the collected values to print `6`. Uses the real `info.picocli:picocli` library.

## Run

    jbang MultipleValues.java
