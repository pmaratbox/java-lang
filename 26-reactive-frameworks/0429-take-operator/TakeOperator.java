//DEPS io.projectreactor:reactor-core:3.6.11

import reactor.core.publisher.Flux;

public class TakeOperator {
    public static void main(String[] a) {
        Flux.range(1, Integer.MAX_VALUE)
            .take(3)
            .subscribe(
                v -> System.out.println(v),
                err -> System.err.println(err),
                () -> System.out.println("completed"));
    }
}
