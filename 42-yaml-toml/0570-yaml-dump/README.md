# 0570 — Dump YAML

Uses the real **SnakeYAML** library (`org.yaml.snakeyaml`) to *serialize* a map
to YAML. The map holds `name=Alice` (string), `age=30` (integer) and
`city=Paris` (string). Wrapping it in a `TreeMap` sorts the keys, and
`DumperOptions.FlowStyle.BLOCK` forces block style (no flow braces, no quotes on
these simple scalars). The output text is produced by the library's serializer,
never hardcoded, and is byte-identical to PyYAML, js-yaml, serde_yaml, YamlDotNet
and go yaml.v3 for the same sorted map.

## Run

    jbang YamlDump.java
