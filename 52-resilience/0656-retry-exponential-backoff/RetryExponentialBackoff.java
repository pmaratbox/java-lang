//DEPS dev.failsafe:failsafe:3.3.2
import dev.failsafe.*;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

public class RetryExponentialBackoff {
  public static void main(String[] a) {
    AtomicInteger attempts = new AtomicInteger();
    // Exponential backoff: 1ms base, doubling up to a 10ms cap (delays kept tiny;
    // the attempt COUNT is delay-independent so output stays deterministic).
    RetryPolicy<Object> rp = RetryPolicy.builder()
        .withMaxRetries(5)
        .withBackoff(Duration.ofMillis(1), Duration.ofMillis(10))
        .build();
    Failsafe.with(rp).get(() -> {
      int n = attempts.incrementAndGet();
      if (n < 4) throw new RuntimeException("transient failure");
      return "done";
    });
    // Scripted: fail three times (attempts 1-3), succeed on attempt 4.
    System.out.println(attempts.get());
  }
}
