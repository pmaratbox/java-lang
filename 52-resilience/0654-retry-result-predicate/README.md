# 0654 — Retry on result

Uses the Failsafe resilience library (`dev.failsafe:failsafe`) with a zero-delay `RetryPolicy` that retries based on the *returned value* rather than on an exception. A shared `AtomicInteger` scripts the sequence: the supplier returns an incrementing counter (1, 2, 3, ...). The policy's `handleResultIf(r -> (int) r < 3)` predicate tells Failsafe to treat any result below 3 as a failure and retry, so the first two results (1 and 2) are rejected and the supplier is invoked again. On the third attempt it returns 3, which satisfies the predicate and is accepted, so the program prints the accepted result `3`.

## Run

    jbang RetryResultPredicate.java
