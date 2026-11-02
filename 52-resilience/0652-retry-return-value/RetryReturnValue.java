//JAVA 26
//DEPS dev.failsafe:failsafe:3.3.2
import dev.failsafe.*;
import java.util.concurrent.atomic.AtomicInteger;

void main() {
  var attempts = new AtomicInteger();
  // Default RetryPolicy has NO delay; allow up to 3 retries (4 total attempts).
  var rp = RetryPolicy.builder().withMaxRetries(3).build();
  // Fails once, then returns "ok". Failsafe retries the failed call and
  // hands back the successful supplier's return value.
  var result = Failsafe.with(rp).get(() -> {
    var v = attempts.incrementAndGet();
    if (v < 2) throw new RuntimeException("fail"); // fail the first attempt
    return "ok"; // second attempt returns the value
  });
  // Print the returned value, not the attempt count.
  IO.println(result); // ok
}
