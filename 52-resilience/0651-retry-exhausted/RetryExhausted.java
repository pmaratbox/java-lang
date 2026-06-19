//DEPS dev.failsafe:failsafe:3.3.2
import dev.failsafe.*;
import java.util.concurrent.atomic.AtomicInteger;

public class RetryExhausted {
  public static void main(String[] args) {
    AtomicInteger attempts = new AtomicInteger();
    // Default RetryPolicy has NO delay; 2 retries => up to 3 total attempts.
    RetryPolicy<Object> rp = RetryPolicy.builder().withMaxRetries(2).build();
    try {
      // The operation always throws, so Failsafe retries until attempts are exhausted.
      Failsafe.with(rp).get(() -> {
        attempts.incrementAndGet();
        throw new RuntimeException("always fails");
      });
    } catch (Exception e) {
      // After 3 failed attempts the retries are exhausted and the error propagates.
      System.out.println("failed");
    }
  }
}
