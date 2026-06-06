import java.util.function.Consumer;

public class RetryOnError {

    // A minimal push-based Observable: subscribe wires a producer to an observer.
    static final class Observable<T> {
        final Consumer<Observer<T>> onSubscribe;

        Observable(Consumer<Observer<T>> onSubscribe) {
            this.onSubscribe = onSubscribe;
        }

        void subscribe(Observer<T> obs) {
            onSubscribe.accept(obs);
        }

        // retry(n): on error, resubscribe to the source up to n times.
        Observable<T> retry(int n) {
            return new Observable<>(downstream -> attempt(this, downstream, n));
        }

        private static <T> void attempt(Observable<T> source, Observer<T> downstream, int remaining) {
            source.subscribe(new Observer<T>() {
                @Override public void next(T value) { downstream.next(value); }
                @Override public void error(Throwable t) {
                    if (remaining > 0) {
                        attempt(source, downstream, remaining - 1);
                    } else {
                        downstream.error(t);
                    }
                }
                @Override public void complete() { downstream.complete(); }
            });
        }
    }

    interface Observer<T> {
        void next(T value);
        void error(Throwable t);
        void complete();
    }

    public static void main(String[] args) {
        // Source: prints "attempt <k>" on each subscription (k = subscription count).
        // k<3 errors; k==3 emits "ok" then completes.
        int[] subscriptions = {0};

        Observable<String> source = new Observable<>(obs -> {
            int k = ++subscriptions[0];
            System.out.println("attempt " + k);
            if (k < 3) {
                obs.error(new RuntimeException("fail"));
            } else {
                obs.next("ok");
                obs.complete();
            }
        });

        source.retry(2).subscribe(new Observer<String>() {
            @Override public void next(String value) { System.out.println(value); }
            @Override public void error(Throwable t) { System.out.println("error: " + t.getMessage()); }
            @Override public void complete() { }
        });
    }
}
