//DEPS io.projectreactor:reactor-core:3.6.11
import reactor.core.publisher.Flux;

public class MapOperator {
    public static void main(String[] a) {
        Flux.just(1, 2, 3, 4)
            .map(x -> x * 2)
            .subscribe(v -> System.out.println(v));
    }
}
