import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ScanAccumulate {
    // A push-based observable: subscribe wires a producer to an observer (next callback).
    interface Observable {
        void subscribe(Consumer<Integer> next);
    }

    static Observable of(int... values) {
        return next -> {
            for (int v : values) next.accept(v);
        };
    }

    // scan keeps state seeded with acc; for each value state = f(state, value) and emits state.
    static Observable scan(Observable source, int acc, BiFunction<Integer, Integer, Integer> f) {
        return next -> {
            int[] state = { acc };
            source.subscribe(value -> {
                state[0] = f.apply(state[0], value);
                next.accept(state[0]);
            });
        };
    }

    public static void main(String[] args) {
        Observable source = of(1, 2, 3, 4);
        Observable sums = scan(source, 0, (s, v) -> s + v);
        sums.subscribe(System.out::println);
    }
}
