# 0567 — YAML scalars

Uses Java's real YAML library (*SnakeYAML*, `org.yaml.snakeyaml.Yaml`) to parse
the fixed mapping `name: Alice\nrole: admin\nage: 30\n` into a `Map`. The three
scalar fields are read back — `name` and `role` as strings, `age` as the integer
`30` — and printed space-joined as `Alice admin 30`. The values are produced by
the parser, never hardcoded.

## Run

    jbang YamlScalars.java
