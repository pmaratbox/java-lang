//DEPS io.projectreactor:reactor-core:3.6.11
//DEPS io.projectreactor:reactor-test:3.6.11

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;
import java.time.Duration;

public class MergeStreams {
    public static void main(String[] a) {
        VirtualTimeScheduler s = VirtualTimeScheduler.getOrSet();

        Flux<Integer> sa = Flux.merge(
                Mono.delay(Duration.ofMillis(10), s).map(x -> 1),
                Mono.delay(Duration.ofMillis(30), s).map(x -> 3),
                Mono.delay(Duration.ofMillis(50), s).map(x -> 5));

        Flux<Integer> sb = Flux.merge(
                Mono.delay(Duration.ofMillis(20), s).map(x -> 2),
                Mono.delay(Duration.ofMillis(40), s).map(x -> 4),
                Mono.delay(Duration.ofMillis(60), s).map(x -> 6));

        Flux.merge(sa, sb).subscribe(v -> System.out.println(v));

        s.advanceTimeBy(Duration.ofMillis(300));
    }
}
