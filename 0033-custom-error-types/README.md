# 0033 — Custom Error Types

Define a custom error, raise it from a `check` that rejects values over `100`, catch it for the input `200`, and print `error: value too large`. A custom exception extends `Exception` (checked, so it appears in `throws`) or `RuntimeException` (unchecked); `super(message)` sets the text read back by `getMessage()`. `try`/`catch` dispatches on the exception's type.

## Run

    javac CustomErrors.java && java CustomErrors
