//DEPS io.projectreactor:reactor-core:3.6.11

import reactor.core.publisher.Flux;

public class FilterOperator {
    public static void main(String[] a) {
        Flux.range(1, 6)
            .filter(x -> x % 2 == 0)
            .subscribe(v -> System.out.println(v));
    }
}
