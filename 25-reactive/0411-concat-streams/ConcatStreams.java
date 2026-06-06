import java.util.function.Consumer;

// A minimal push-based Observable implemented from scratch.
final class Observable<T> {
    interface OnSubscribe<T> {
        void subscribe(Observer<T> observer);
    }

    final OnSubscribe<T> onSubscribe;

    Observable(OnSubscribe<T> onSubscribe) {
        this.onSubscribe = onSubscribe;
    }

    void subscribe(Observer<T> observer) {
        onSubscribe.subscribe(observer);
    }

    // Emit the given items synchronously, then complete.
    @SafeVarargs
    static <T> Observable<T> of(T... items) {
        return new Observable<>(observer -> {
            for (T item : items) {
                observer.next(item);
            }
            observer.complete();
        });
    }

    // concat(a, b): subscribe to a; on a.complete, subscribe to b;
    // on b.complete, complete. Fully synchronous, no scheduler needed.
    static <T> Observable<T> concat(Observable<T> a, Observable<T> b) {
        return new Observable<>(downstream -> a.subscribe(new Observer<T>() {
            @Override public void next(T value) { downstream.next(value); }
            @Override public void error(Throwable t) { downstream.error(t); }
            @Override public void complete() {
                b.subscribe(new Observer<T>() {
                    @Override public void next(T value) { downstream.next(value); }
                    @Override public void error(Throwable t) { downstream.error(t); }
                    @Override public void complete() { downstream.complete(); }
                });
            }
        }));
    }
}

interface Observer<T> {
    void next(T value);
    void error(Throwable t);
    void complete();
}

public class ConcatStreams {
    public static void main(String[] args) {
        Observable<Integer> a = Observable.of(1, 2);
        Observable<Integer> b = Observable.of(3, 4);

        Consumer<Integer> print = System.out::println;

        Observable.concat(a, b).subscribe(new Observer<Integer>() {
            @Override public void next(Integer value) { print.accept(value); }
            @Override public void error(Throwable t) { /* unused */ }
            @Override public void complete() { /* done */ }
        });
    }
}
