# 0011 — Error Handling

Write a `divide(a, b)` that throws on a zero divisor, then call it on `10 / 2`
(prints the result) and `10 / 0` (prints an error). Java uses **exceptions**:
`throw` raises (here `ArithmeticException`), `try` / `catch` handles it, and
`.getMessage()` returns the text.

## Run

    javac ErrorHandling.java && java ErrorHandling
