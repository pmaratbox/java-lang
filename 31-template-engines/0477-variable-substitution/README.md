# 0477 — Variable substitution

Render a template with the real FreeMarker engine. This lesson parses the fixed template `Hello ${name}` into a `Template`, then renders it with the fixed data `{name: alice}` via `t.process(data, writer)`. FreeMarker's `${...}` interpolation substitutes the `name` variable into the output. Uses the real `org.freemarker:freemarker` library.

## Run

    jbang VariableSubstitution.java
