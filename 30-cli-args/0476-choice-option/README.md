# 0476 — Choice option

Restrict an option to a fixed set of choices. This lesson uses the real picocli library and binds `--color` to a Java `enum Color { red, green, blue }`; picocli validates the argument against the enum constants and rejects anything outside the set. For determinism it parses a hardcoded argv `{"--color", "green"}` rather than the real process arguments, so it always prints `green`. Uses the real `info.picocli:picocli` library.

## Run

    jbang ChoiceOption.java
