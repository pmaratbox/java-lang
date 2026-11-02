import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;


// A minimal push-based Observable: subscribe wires a producer to an observer.
interface Observable {
    void subscribe(Consumer<Integer> next);
}

// map returns a new Observable whose next forwards f(value).
static Observable map(Observable source, IntUnaryOperator f) {
    return next -> source.subscribe(value -> next.accept(f.applyAsInt(value)));
}

void main() {
    Observable source = next -> {
        for (var v : new int[] {1, 2, 3, 4}) {
            next.accept(v);
        }
    };

    var doubled = map(source, x -> x * 2);
    doubled.subscribe(System.out::println);
}
