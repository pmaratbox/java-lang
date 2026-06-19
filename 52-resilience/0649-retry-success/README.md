# 0649 — Succeeds first try

Uses the Failsafe resilience library (`dev.failsafe:failsafe`) with a zero-delay `RetryPolicy` allowing up to 3 retries. A shared `AtomicInteger` counts attempts; the wrapped supplier returns successfully on its very first call, so Failsafe never retries. The counter shows the library made exactly one attempt, printing `1`.

## Run

    jbang RetrySuccess.java
