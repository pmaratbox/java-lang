//DEPS io.projectreactor:reactor-core:3.6.11

import reactor.core.publisher.Flux;

public class ConcatStreams {
    public static void main(String[] a) {
        Flux<Integer> first = Flux.just(1, 2);
        Flux<Integer> second = Flux.just(3, 4);
        Flux.concat(first, second)
            .subscribe(v -> System.out.println(v));
    }
}
