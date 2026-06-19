# 0652 — Return a value

Uses the Failsafe resilience library (`dev.failsafe:failsafe`) with a zero-delay `RetryPolicy` allowing up to 3 retries. A shared `AtomicInteger` scripts the failure sequence: the wrapped supplier throws on its first call and returns the string `ok` on the second. Failsafe retries the failed attempt and propagates the successful supplier's return value back to the caller, so the program prints the returned value `ok` (not the attempt count).

## Run

    jbang RetryReturnValue.java
