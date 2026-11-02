//JAVA 26
//DEPS dev.failsafe:failsafe:3.3.2
import dev.failsafe.*;
import java.util.concurrent.atomic.AtomicInteger;

void main() {
  var attempts = new AtomicInteger();
  // Up to 3 retries (=> up to 4 attempts); default policy has no delay.
  var rp = RetryPolicy.builder().withMaxRetries(3).build();
  Failsafe.with(rp).get(() -> {
    var n = attempts.incrementAndGet();
    if (n < 2) throw new RuntimeException("transient failure");
    return "ok";
  });
  // Scripted: fail once (attempt 1), succeed on attempt 2.
  System.out.println(attempts.get());
}
