import java.util.function.Consumer;
import java.util.function.Function;

public class CatchError {

    // A push-based Observable: subscribing wires a producer to an observer.
    @FunctionalInterface
    interface Observable<T> {
        void subscribe(Observer<T> observer);
    }

    // An observer is the trio of callbacks for the stream protocol.
    static final class Observer<T> {
        final Consumer<T> onNext;
        final Consumer<Throwable> onError;
        final Runnable onComplete;

        Observer(Consumer<T> onNext, Consumer<Throwable> onError, Runnable onComplete) {
            this.onNext = onNext;
            this.onError = onError;
            this.onComplete = onComplete;
        }
    }

    // catchError forwards next/complete, but on error subscribes to the fallback
    // produced from the thrown error instead of propagating it downstream.
    static <T> Observable<T> catchError(Observable<T> source,
                                        Function<Throwable, Observable<T>> fallback) {
        return downstream -> source.subscribe(new Observer<>(
            downstream.onNext,
            err -> fallback.apply(err).subscribe(downstream),
            downstream.onComplete
        ));
    }

    public static void main(String[] args) {
        // source emits 1, 2, then signals an error.
        Observable<Integer> source = observer -> {
            observer.onNext.accept(1);
            observer.onNext.accept(2);
            observer.onError.accept(new RuntimeException("boom"));
        };

        // fallback emits 9 then completes.
        Observable<Integer> fallback = observer -> {
            observer.onNext.accept(9);
            observer.onComplete.run();
        };

        Observable<Integer> safe = catchError(source, err -> fallback);

        safe.subscribe(new Observer<>(
            v -> System.out.println(v),
            e -> System.out.println("error: " + e.getMessage()),
            () -> { /* completed */ }
        ));
    }
}
