# 0480 — Nested access

Render a template with the real FreeMarker engine. This lesson parses the fixed template `${user.name}` into a `Template`, then renders it with the nested data `{user: {name: alice}}` via `t.process(data, writer)`. FreeMarker's dotted `${user.name}` interpolation walks into the nested map to reach the inner field. Uses the real `org.freemarker:freemarker` library.

## Run

    jbang NestedAccess.java
