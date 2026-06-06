# 0419 — Catch Error

Implement catchError that, on an error from the source, switches to a fallback stream. Here the operator is a lambda returning an Observable that swaps the error callback to subscribe the fallback.

## Run

    javac CatchError.java && java CatchError
