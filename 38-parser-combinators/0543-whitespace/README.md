# 0543 — Whitespace handling

Uses the [jparsec](https://github.com/jparsec/jparsec) parser-combinator
library. The `.between(open, close)` combinator runs the inner parser
surrounded by two other parsers and keeps only the inner result. Here the inner
parser is `Scanners.INTEGER` mapped to an int, and both surrounding parsers are
`Scanners.WHITESPACES.optional(null)`, which skip the optional leading and
trailing spaces in the input `  42  ` so only `42` is produced.

## Run

    jbang Whitespace.java
