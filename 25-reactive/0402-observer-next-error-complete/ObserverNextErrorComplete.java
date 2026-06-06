import java.util.function.Consumer;

public class ObserverNextErrorComplete {

    // An observer that enforces the contract: next* then a single terminal
    // (complete or error). Once stopped, next() and further terminals are no-ops.
    static final class SafeObserver<T> {
        private boolean stopped = false;
        private final Consumer<T> onNext;
        private final Consumer<Throwable> onError;
        private final Runnable onComplete;

        SafeObserver(Consumer<T> onNext, Consumer<Throwable> onError, Runnable onComplete) {
            this.onNext = onNext;
            this.onError = onError;
            this.onComplete = onComplete;
        }

        void next(T value) {
            if (stopped) return;
            onNext.accept(value);
        }

        void error(Throwable t) {
            if (stopped) return;
            stopped = true;
            onError.accept(t);
        }

        void complete() {
            if (stopped) return;
            stopped = true;
            onComplete.run();
        }
    }

    public static void main(String[] args) {
        SafeObserver<Integer> observer = new SafeObserver<>(
            v -> System.out.println(v),
            e -> System.out.println("error: " + e.getMessage()),
            () -> System.out.println("complete")
        );

        observer.next(1);
        observer.next(2);
        observer.complete();
        observer.next(3); // ignored: terminal already delivered
    }
}
