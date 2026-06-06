import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ReactiveSignalComputed {
    static final class Signal<T> {
        private T value;
        private final List<Runnable> subscribers = new ArrayList<>();

        Signal(T value) {
            this.value = value;
        }

        T get() {
            return value;
        }

        void set(T next) {
            this.value = next;
            for (Runnable r : new ArrayList<>(subscribers)) {
                r.run();
            }
        }

        void subscribe(Runnable r) {
            subscribers.add(r);
        }
    }

    static final class Computed<T> {
        private T cached;
        private final Supplier<T> compute;

        Computed(Supplier<T> compute, Signal<?>... deps) {
            this.compute = compute;
            this.cached = compute.get();
            for (Signal<?> dep : deps) {
                dep.subscribe(this::recompute);
            }
        }

        private void recompute() {
            this.cached = compute.get();
        }

        T get() {
            return cached;
        }
    }

    public static void main(String[] args) {
        Signal<Integer> a = new Signal<>(2);
        Signal<Integer> b = new Signal<>(3);

        Computed<Integer> sum = new Computed<>(() -> a.get() + b.get(), a, b);

        System.out.println(sum.get());

        a.set(10);

        System.out.println(sum.get());
    }
}
