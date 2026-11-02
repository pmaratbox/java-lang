//JAVA 26
//DEPS io.projectreactor:reactor-core:3.6.11

import reactor.core.publisher.Flux;

void main() {
    Flux.range(1, Integer.MAX_VALUE)
        .take(3)
        .subscribe(
            v -> IO.println(v),
            err -> System.err.println(err),
            () -> IO.println("completed"));
}
