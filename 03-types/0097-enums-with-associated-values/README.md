# 0097 — Enums with Associated Values

Define a shape type carrying associated data — `Rect(2, 3)` and `Square(4)` — compute each area by matching on the variant, and print `6` and `16`. A `sealed interface` with `record` variants is Java's sum type; a `switch` with record patterns (Java 21+) destructures each variant's components.

## Run

    javac EnumAssociated.java && java EnumAssociated
