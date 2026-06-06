//DEPS io.projectreactor:reactor-core:3.6.11
//DEPS io.projectreactor:reactor-test:3.6.11

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;
import java.time.Duration;

public class FlatmapStreams {
    public static void main(String[] a) {
        VirtualTimeScheduler s = VirtualTimeScheduler.getOrSet();

        // outer emits 1@10, 2@20
        Flux<Integer> outer = Flux.concat(
            Mono.delay(Duration.ofMillis(10), s).map(t -> 1),
            Mono.delay(Duration.ofMillis(10), s).map(t -> 2)
        );

        // map each outer value n to a timed inner: n at +5, n*10 at +30
        outer.flatMap(n -> Flux.concat(
                Mono.delay(Duration.ofMillis(5), s).map(t -> n),
                Mono.delay(Duration.ofMillis(25), s).map(t -> n * 10)
            ))
            .subscribe(v -> System.out.println(v));

        s.advanceTimeBy(Duration.ofMillis(300));
    }
}
