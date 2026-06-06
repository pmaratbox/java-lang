//DEPS io.projectreactor:reactor-core:3.6.11
//DEPS io.projectreactor:reactor-test:3.6.11

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;
import java.time.Duration;

public class DebounceVirtualTime {
    public static void main(String[] a) {
        VirtualTimeScheduler s = VirtualTimeScheduler.getOrSet();

        // source emits a@10, b@20, c@100; complete late (after t130)
        Flux<String> source = Flux.concat(
            Mono.delay(Duration.ofMillis(10), s).map(x -> "a"),
            Mono.delay(Duration.ofMillis(10), s).map(x -> "b"),
            Mono.delay(Duration.ofMillis(80), s).map(x -> "c"),
            Mono.delay(Duration.ofMillis(40), s).then(Mono.empty())
        );

        // debounce with a quiet window of 30
        source.sampleTimeout(v -> Mono.delay(Duration.ofMillis(30), s))
              .subscribe(v -> System.out.println(v));

        s.advanceTimeBy(Duration.ofMillis(300));
    }
}
