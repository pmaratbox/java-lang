# 0102 — Threads Returning Values

Run two threads that compute the squares of 3 and 4, join them, and print the sum of their results `25`. A `Thread` cannot return a value directly, so each thread writes into a shared holder that main reads after `join()`.

## Run

    javac ReturnValues.java && java ReturnValues
