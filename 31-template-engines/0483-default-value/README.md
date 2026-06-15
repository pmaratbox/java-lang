# 0483 — Default value

Render a template with the real FreeMarker engine, supplying a default for a missing value. This lesson parses the fixed template `${name!"anonymous"}` into a `Template`, then renders it with data that has NO `name` key via `t.process(data, writer)`. FreeMarker's `!` default operator falls back to `"anonymous"` when the variable is missing or undefined, avoiding an error. Uses the real `org.freemarker:freemarker` library.

## Run

    jbang DefaultValue.java
