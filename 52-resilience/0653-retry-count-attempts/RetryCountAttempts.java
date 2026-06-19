//DEPS dev.failsafe:failsafe:3.3.2
import dev.failsafe.*;
import java.util.concurrent.atomic.AtomicInteger;

public class RetryCountAttempts {
  public static void main(String[] a) {
    AtomicInteger attempts = new AtomicInteger();
    // 4 retries (=> up to 5 total attempts); default policy has no delay.
    RetryPolicy<Object> rp = RetryPolicy.builder().withMaxRetries(4).build();
    try {
      Failsafe.with(rp).get(() -> {
        attempts.incrementAndGet();
        throw new RuntimeException("always fails");
      });
    } catch (RuntimeException e) {
      // Retries exhausted: Failsafe rethrows the last failure after every attempt.
    }
    // The library drove 5 attempts (1 initial + 4 retries).
    System.out.println(attempts.get());
  }
}
