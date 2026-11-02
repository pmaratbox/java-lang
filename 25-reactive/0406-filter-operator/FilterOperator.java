import java.util.function.Consumer;
import java.util.function.Predicate;


// A minimal push-based Observable: subscribe wires a producer to an observer.
interface Observable<T> {
    void subscribe(Consumer<T> onNext);
}

// filter forwards a value only when the predicate accepts it.
static <T> Observable<T> filter(Observable<T> source, Predicate<T> pred) {
    return onNext -> source.subscribe(value -> {
        if (pred.test(value)) {
            onNext.accept(value);
        }
    });
}

void main() {
    // Source synchronously emits 1..6 to whoever subscribes.
    Observable<Integer> source = onNext -> {
        for (var v = 1; v <= 6; v++) {
            onNext.accept(v);
        }
    };

    filter(source, v -> v % 2 == 0).subscribe(System.out::println);
}
