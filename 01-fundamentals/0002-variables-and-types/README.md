# 0002 — Variables & basic types

Declare locals with `var`: the initializers `42`, `3.14`, `"hello"`, and `true`
infer `int`, `double`, `String`, and `boolean`, respectively. Each variable keeps
that type; `var` does not make Java dynamically typed. `String` is the only
reference type of the four. The compact `void main()` contains the example,
and string concatenation converts each value to its textual representation.

## Run

    javac Variables.java && java Variables
