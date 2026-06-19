# 0656 — Exponential backoff

Uses the Failsafe resilience library (`dev.failsafe:failsafe`) with a `RetryPolicy` configured for exponential backoff via `withBackoff` (1ms base delay doubling up to a 10ms cap). A scripted supplier, guarded by an `AtomicInteger` counter, throws on its first three attempts and returns `"done"` on the fourth. Failsafe retries with growing delays between attempts and the call eventually succeeds. The total attempt count driven by the library prints `4`.

## Run

    jbang RetryExponentialBackoff.java
