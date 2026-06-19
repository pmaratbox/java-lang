//DEPS dev.failsafe:failsafe:3.3.2
import dev.failsafe.*;
import java.util.concurrent.atomic.AtomicInteger;

public class RetryEventualSuccess {
  public static void main(String[] a) {
    AtomicInteger attempts = new AtomicInteger();
    // Up to 3 retries (=> up to 4 attempts); default policy has no delay.
    RetryPolicy<Object> rp = RetryPolicy.builder().withMaxRetries(3).build();
    Failsafe.with(rp).get(() -> {
      int n = attempts.incrementAndGet();
      if (n < 2) throw new RuntimeException("transient failure");
      return "ok";
    });
    // Scripted: fail once (attempt 1), succeed on attempt 2.
    System.out.println(attempts.get());
  }
}
