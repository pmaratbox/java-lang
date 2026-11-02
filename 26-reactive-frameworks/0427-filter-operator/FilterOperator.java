//JAVA 26
//DEPS io.projectreactor:reactor-core:3.6.11

import reactor.core.publisher.Flux;

void main() {
    Flux.range(1, 6)
        .filter(x -> x % 2 == 0)
        .subscribe(v -> IO.println(v));
}
