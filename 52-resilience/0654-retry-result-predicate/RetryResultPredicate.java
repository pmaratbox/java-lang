//JAVA 26
//DEPS dev.failsafe:failsafe:3.3.2
import dev.failsafe.*;
import java.util.concurrent.atomic.AtomicInteger;

void main() {
  var n = new AtomicInteger();
  // Retry based on the RETURNED VALUE (not on exception): keep retrying while result < 3.
  var rp = RetryPolicy.builder()
      .withMaxRetries(9)
      .handleResultIf(r -> (int) r < 3)
      .build();
  int accepted = Failsafe.with(rp).get(() -> n.incrementAndGet());
  System.out.println(accepted);   // 3
}
