//JAVA 26
//DEPS dev.failsafe:failsafe:3.3.2
import dev.failsafe.*;
import java.util.concurrent.atomic.AtomicInteger;

void main() {
  var attempts = new AtomicInteger();
  // Default RetryPolicy has NO delay; up to 3 retries are allowed but never needed.
  var rp = RetryPolicy.builder().withMaxRetries(3).build();
  // The operation succeeds on its first call, so Failsafe never retries.
  var result = Failsafe.with(rp).get(() -> {
    attempts.incrementAndGet();
    return "ok"; // no exception => succeeds first try
  });
  // The library drove exactly one attempt.
  IO.println(attempts.get()); // 1
}
