//DEPS io.projectreactor:reactor-core:3.6.11

import reactor.core.publisher.Flux;

public class ScanAccumulate {
    public static void main(String[] a) {
        Flux.just(1, 2, 3, 4)
            .scan(0, (acc, x) -> acc + x)
            .skip(1)
            .subscribe(v -> System.out.println(v));
    }
}
