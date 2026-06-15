# 0544 — Expression

Uses the [jparsec](https://github.com/jparsec/jparsec) parser-combinator
library: the `.sepBy(...)` combinator runs an integer parser
(`Scanners.INTEGER.map(Integer::parseInt)`) repeatedly, requiring a `'+'`
separator parser (`Scanners.isChar('+')`) between elements, and collects the
matched terms into a `List<Integer>`. Calling `.parse("10+20+30")` runs the
parser on the fixed input and yields `[10, 20, 30]`, whose elements are then
folded (summed) to `60`.

## Run

    jbang Expression.java
