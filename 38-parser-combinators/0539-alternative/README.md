# 0539 — Alternative

Uses the [jparsec](https://github.com/jparsec/jparsec) parser-combinator
library. The `Parsers.or(...)` combinator builds a CHOICE parser: it tries the
first alternative (`Scanners.string("cat")`) and, if that fails, tries the next
(`Scanners.string("dog")`). Running it on the fixed input `dog` matches the
second alternative and prints `dog`.

## Run

    jbang Alternative.java
