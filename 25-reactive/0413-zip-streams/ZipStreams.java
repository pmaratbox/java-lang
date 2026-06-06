import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ZipStreams {

    // A minimal push-based Observable implemented from scratch.
    static final class Observable {
        final Consumer<Observer> onSubscribe;

        Observable(Consumer<Observer> onSubscribe) {
            this.onSubscribe = onSubscribe;
        }

        void subscribe(Observer observer) {
            onSubscribe.accept(observer);
        }

        static Observable of(int... values) {
            return new Observable(obs -> {
                for (int v : values) {
                    obs.next(v);
                }
                obs.complete();
            });
        }
    }

    interface Observer {
        void next(int value);

        void complete();
    }

    // zip pairs values by index: buffer each source, emit combine(x, y)
    // whenever both per-source queues are non-empty.
    static Observable zip(Observable a, Observable b, BiFunction<Integer, Integer, Integer> combine) {
        return new Observable(downstream -> {
            Deque<Integer> qa = new ArrayDeque<>();
            Deque<Integer> qb = new ArrayDeque<>();

            Runnable drain = () -> {
                while (!qa.isEmpty() && !qb.isEmpty()) {
                    int x = qa.removeFirst();
                    int y = qb.removeFirst();
                    downstream.next(combine.apply(x, y));
                }
            };

            a.subscribe(new Observer() {
                public void next(int value) {
                    qa.addLast(value);
                    drain.run();
                }

                public void complete() {
                }
            });

            b.subscribe(new Observer() {
                public void next(int value) {
                    qb.addLast(value);
                    drain.run();
                }

                public void complete() {
                }
            });
        });
    }

    public static void main(String[] args) {
        Observable a = Observable.of(1, 2, 3);
        Observable b = Observable.of(10, 20, 30);

        zip(a, b, (x, y) -> x + y).subscribe(new Observer() {
            public void next(int value) {
                System.out.println(value);
            }

            public void complete() {
            }
        });
    }
}
