# 0031 — Type Conversion & Parsing

Parse the string `"42"` into an integer and `"3.5"` into a float, then convert the integer back to a string, printing `int: 42`, `float: 3.5`, and `str: 42`. The boxed wrappers parse: `Integer.parseInt("42")` and `Double.parseDouble("3.5")`, both throwing `NumberFormatException` on bad input; `Integer.toString` (or `String.valueOf`) converts back. Parsing is locale-independent.

## Run

    javac Conversion.java && java Conversion
