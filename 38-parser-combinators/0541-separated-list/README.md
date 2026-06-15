# 0541 — Separated list

Uses the [jparsec](https://github.com/jparsec/jparsec) parser-combinator
library: the `.sepBy(...)` combinator runs an integer parser
(`Scanners.INTEGER.map(Integer::parseInt)`) repeatedly, requiring a separator
parser (`Scanners.isChar(',')`) between elements, and collects the matches into
a `List<Integer>`. Calling `.parse("1,2,3")` runs the parser on the fixed input
and yields `[1, 2, 3]`, whose elements sum to `6`.

## Run

    jbang SeparatedList.java
