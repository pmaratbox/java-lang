# 0420 — Retry On Error

Implement retry(n) that resubscribes to the source on error up to n times; the source succeeds on the 3rd subscription. The Observer's error callback recursively resubscribes the producer Consumer until the retry budget is exhausted.

## Run

    javac RetryOnError.java && java RetryOnError
