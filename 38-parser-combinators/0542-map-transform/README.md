# 0542 — Map / transform

Uses the [jparsec](https://github.com/jparsec/jparsec) parser-combinator
library. `Scanners.INTEGER` matches a run of digits, and the `.map` combinator
transforms a parser's result: the first `.map(Integer::parseInt)` turns the
matched text into an `int`, and a second `.map(n -> n * 2)` doubles it. Running
the combined parser on the fixed input `"21"` yields `21`, which is mapped to
`42`.

## Run

    jbang MapTransform.java
