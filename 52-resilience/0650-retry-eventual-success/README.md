# 0650 — Eventual success

Uses the Failsafe resilience library (`dev.failsafe:failsafe`) with a `RetryPolicy` of up to 3 retries and no delay. A scripted supplier, guarded by an `AtomicInteger` counter, throws on its first attempt and returns `"ok"` on the second. Failsafe catches the first failure, retries, and the call eventually succeeds. The total attempt count driven by the library prints `2`.

## Run

    jbang RetryEventualSuccess.java
