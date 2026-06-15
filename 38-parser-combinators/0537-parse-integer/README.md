# 0537 — Parse an integer

Uses the [jparsec](https://github.com/jparsec/jparsec) parser-combinator
library: `Scanners.INTEGER` is a combinator that matches a run of one-or-more
digits, and `.map(Integer::parseInt)` transforms the matched text into an
`int`. Calling `.parse("42")` runs the parser on the fixed input and yields
`42`.

## Run

    jbang ParseInteger.java
