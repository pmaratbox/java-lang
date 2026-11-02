//JAVA 26
//DEPS dev.failsafe:failsafe:3.3.2
import dev.failsafe.*;
import java.util.concurrent.atomic.AtomicInteger;

void main() {
  var attempts = new AtomicInteger();
  // Default RetryPolicy has NO delay; 2 retries => up to 3 total attempts.
  var rp = RetryPolicy.builder().withMaxRetries(2).build();
  try {
    // The operation always throws, so Failsafe retries until attempts are exhausted.
    Failsafe.with(rp).get(() -> {
      attempts.incrementAndGet();
      throw new RuntimeException("always fails");
    });
  } catch (Exception e) {
    // After 3 failed attempts the retries are exhausted and the error propagates.
    IO.println("failed");
  }
}
