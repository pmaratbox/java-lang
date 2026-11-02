//JAVA 26
//DEPS io.projectreactor:reactor-core:3.6.11

import reactor.core.publisher.Flux;

void main() {
    var first = Flux.just(1, 2, 3);
    var second = Flux.just(10, 20, 30);
    Flux.zip(first, second, (x, y) -> x + y)
            .subscribe(v -> System.out.println(v));
}
