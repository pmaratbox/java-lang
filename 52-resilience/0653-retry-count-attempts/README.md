# 0653 — Count attempts

Uses the Failsafe resilience library (`dev.failsafe:failsafe`) with a `RetryPolicy` of 4 retries (up to 5 total attempts) and no delay. A scripted supplier, guarded by an `AtomicInteger` counter, always throws, so Failsafe exhausts every retry. After the library gives up it raises a `FailsafeException`, which we catch; the counter — incremented once per real attempt the library made — reports the total `5`.

## Run

    jbang RetryCountAttempts.java
