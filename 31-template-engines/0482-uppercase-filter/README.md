# 0482 — Uppercase filter

Render a fixed template with the real Apache FreeMarker engine, applying its `?upper_case` built-in to a fixed value `name=alice`. FreeMarker built-ins are invoked with `?` after an expression, so `${name?upper_case}` is the engine's uppercase filter/helper. The template string and data map are fixed, and the engine parses and renders them to produce `ALICE`. Uses the real `org.freemarker:freemarker` library.

## Run

    jbang UppercaseFilter.java
