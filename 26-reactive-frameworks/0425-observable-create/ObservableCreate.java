//DEPS io.projectreactor:reactor-core:3.6.11

import reactor.core.publisher.Flux;

public class ObservableCreate {
    public static void main(String[] a) {
        Flux.just(1, 2, 3)
            .subscribe(
                v -> System.out.println(v),
                err -> {},
                () -> System.out.println("done")
            );
    }
}
