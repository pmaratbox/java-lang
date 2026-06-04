# 0196 — Error Wrapping

Wrap an inner error "inner" inside an outer context and print the combined message `outer: inner`. Java chains exceptions with a `cause` constructor, and `getCause()` retrieves the wrapped throwable.

## Run

    javac Wrapping.java && java Wrapping
