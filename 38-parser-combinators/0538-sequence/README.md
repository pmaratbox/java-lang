# 0538 — Sequence

Uses the [jparsec](https://github.com/jparsec/jparsec) parser-combinator
library. `Parsers.sequence(p1, p2, mapper)` runs the parser for `'a'` and THEN
the parser for `'b'` in order, feeding both results into the mapper which
concatenates them into the string `ab`. The parser is then run on the fixed
input `"ab"`.

## Run

    jbang Sequence.java
