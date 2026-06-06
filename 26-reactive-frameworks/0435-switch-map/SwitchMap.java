//DEPS io.projectreactor:reactor-core:3.6.11
//DEPS io.projectreactor:reactor-test:3.6.11

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.scheduler.VirtualTimeScheduler;
import java.time.Duration;

public class SwitchMap {
    public static void main(String[] a) {
        VirtualTimeScheduler s = VirtualTimeScheduler.getOrSet();

        // outer emits 1@10, 2@20
        Flux<Integer> outer = Flux.concat(
            Mono.delay(Duration.ofMillis(10), s).map(t -> 1),
            Mono.delay(Duration.ofMillis(10), s).map(t -> 2)
        );

        // inner(n) emits n at +5 and n*10 at +30
        outer.switchMap(n -> Flux.concat(
                Mono.delay(Duration.ofMillis(5), s).map(t -> n),
                Mono.delay(Duration.ofMillis(25), s).map(t -> n * 10)
            ))
            .subscribe(v -> System.out.println(v));

        s.advanceTimeBy(Duration.ofMillis(300));
    }
}
