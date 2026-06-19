# 0651 — Retries exhausted

Uses the Failsafe resilience library (`dev.failsafe:failsafe`) with a zero-delay `RetryPolicy` allowing 2 retries (3 total attempts). A shared `AtomicInteger` counts attempts; the wrapped supplier always throws, so Failsafe retries until its attempts are exhausted and then re-raises the last failure. The surrounding `try`/`catch` handles that exhausted error and prints `failed`.

## Run

    jbang RetryExhausted.java
