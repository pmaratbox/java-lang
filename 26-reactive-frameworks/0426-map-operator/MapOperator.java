//JAVA 26
//DEPS io.projectreactor:reactor-core:3.6.11
import reactor.core.publisher.Flux;

void main() {
    Flux.just(1, 2, 3, 4)
        .map(x -> x * 2)
        .subscribe(v -> System.out.println(v));
}
