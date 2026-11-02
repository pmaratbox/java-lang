//JAVA 26
//DEPS io.projectreactor:reactor-core:3.6.11

import reactor.core.publisher.Flux;

void main() {
    var first = Flux.just(1, 2);
    var second = Flux.just(3, 4);
    Flux.concat(first, second)
        .subscribe(v -> System.out.println(v));
}
