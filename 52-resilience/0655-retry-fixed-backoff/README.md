# 0655 — Fixed backoff

Uses the Failsafe resilience library (`dev.failsafe:failsafe`) with a `RetryPolicy` that applies a FIXED backoff — a constant `withDelay` of 1ms between retries (failsafe forbids a literal zero delay, and the printed attempt count is delay-independent). A scripted supplier, guarded by an `AtomicInteger` counter, fails on its first two attempts and returns `"done"` on the third. Failsafe waits the fixed delay between each retry and re-invokes the operation until it succeeds. The total attempt count driven by the library prints `3`.

## Run

    jbang RetryFixedBackoff.java
