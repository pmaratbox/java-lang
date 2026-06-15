# 0540 — Many (repetition)

Uses the [jparsec](https://github.com/jparsec/jparsec) parser-combinator
library. The `.many()` combinator applies a parser zero-or-more times and
collects every match into a `List`. Here `Scanners.isChar('a').many()` runs the
single-character parser repeatedly over the input `aaaa`; printing the resulting
list's size shows that the combinator parsed `4` occurrences.

## Run

    jbang Many.java
