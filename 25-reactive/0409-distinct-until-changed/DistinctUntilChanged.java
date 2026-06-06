import java.util.function.Consumer;

public class DistinctUntilChanged {

    // A push-based Observable implemented from scratch.
    interface Observable<T> {
        void subscribe(Observer<T> observer);
    }

    interface Observer<T> {
        void next(T value);

        void complete();
    }

    // Emit a fixed sequence of values synchronously.
    static <T> Observable<T> of(T[] values) {
        return observer -> {
            for (T v : values) {
                observer.next(v);
            }
            observer.complete();
        };
    }

    // distinctUntilChanged: forward a value only when it differs from the last one emitted.
    static <T> Observable<T> distinctUntilChanged(Observable<T> source) {
        return observer -> source.subscribe(new Observer<T>() {
            boolean hasLast = false;
            T last;

            @Override
            public void next(T value) {
                if (!hasLast || !value.equals(last)) {
                    hasLast = true;
                    last = value;
                    observer.next(value);
                }
            }

            @Override
            public void complete() {
                observer.complete();
            }
        });
    }

    public static void main(String[] args) {
        Integer[] input = {1, 1, 2, 2, 2, 3, 1};
        Consumer<Integer> print = System.out::println;

        distinctUntilChanged(of(input)).subscribe(new Observer<Integer>() {
            @Override
            public void next(Integer value) {
                print.accept(value);
            }

            @Override
            public void complete() {
            }
        });
    }
}
