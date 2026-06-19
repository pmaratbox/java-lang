//DEPS dev.failsafe:failsafe:3.3.2
import dev.failsafe.*;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

public class RetryFixedBackoff {
  public static void main(String[] args) {
    AtomicInteger attempts = new AtomicInteger();
    // Fixed backoff: a constant 1ms delay between retries (failsafe forbids a zero delay).
    RetryPolicy<Object> rp = RetryPolicy.builder()
        .withMaxRetries(3)                 // up to 3 retries => up to 4 attempts
        .withDelay(Duration.ofMillis(1))   // FIXED delay strategy
        .build();
    Failsafe.with(rp).get(() -> {
      int v = attempts.incrementAndGet();
      if (v < 3) throw new RuntimeException("fail");  // fails twice, then succeeds
      return "done";
    });
    System.out.println(attempts.get());   // 3
  }
}
