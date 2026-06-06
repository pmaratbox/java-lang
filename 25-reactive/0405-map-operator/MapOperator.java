import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;

public class MapOperator {

    // A minimal push-based Observable: subscribe wires a producer to an observer.
    interface Observable {
        void subscribe(Consumer<Integer> next);
    }

    // map returns a new Observable whose next forwards f(value).
    static Observable map(Observable source, IntUnaryOperator f) {
        return next -> source.subscribe(value -> next.accept(f.applyAsInt(value)));
    }

    public static void main(String[] args) {
        Observable source = next -> {
            for (int v : new int[] {1, 2, 3, 4}) {
                next.accept(v);
            }
        };

        Observable doubled = map(source, x -> x * 2);
        doubled.subscribe(System.out::println);
    }
}
