//DEPS io.projectreactor:reactor-core:3.6.11
//DEPS io.projectreactor:reactor-test:3.6.11

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;

import java.time.Duration;

public class CombineLatest {
    public static void main(String[] a) {
        VirtualTimeScheduler s = VirtualTimeScheduler.getOrSet();

        // A emits 1@10, 2@30
        Flux<Integer> sourceA = Flux.concat(
                Mono.delay(Duration.ofMillis(10), s).map(t -> 1),
                Mono.delay(Duration.ofMillis(20), s).map(t -> 2)
        );

        // B emits 10@20
        Flux<Integer> sourceB = Mono.delay(Duration.ofMillis(20), s).map(t -> 10).flux();

        Flux.combineLatest(sourceA, sourceB, (x, y) -> "(" + x + ", " + y + ")")
                .subscribe(v -> System.out.println(v));

        s.advanceTimeBy(Duration.ofMillis(300));
    }
}
