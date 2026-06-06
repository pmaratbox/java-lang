import java.util.function.Consumer;

public class TakeOperator {

    // A minimal push-based Observable: subscribe wires a producer to an observer
    // and returns an unsubscribe handle.
    interface Subscription {
        void unsubscribe();
    }

    static final class Observer {
        Consumer<Integer> next;
        Runnable complete;

        Observer(Consumer<Integer> next, Runnable complete) {
            this.next = next;
            this.complete = complete;
        }
    }

    interface Observable {
        Subscription subscribe(Observer obs);
    }

    // Unbounded source of the natural numbers 1,2,3,4,... It checks a "stopped"
    // flag between emissions so unsubscribing actually halts the infinite loop.
    static Observable naturals() {
        return obs -> {
            final boolean[] stopped = {false};
            for (int i = 1; !stopped[0]; i++) {
                obs.next.accept(i);
            }
            return () -> stopped[0] = true;
        };
    }

    // take(n): forward the first n values, then complete and unsubscribe the
    // source so it stops being driven.
    static Observable take(Observable source, int n) {
        return obs -> {
            final int[] count = {0};
            final Subscription[] holder = new Subscription[1];
            final boolean[] done = {false};
            holder[0] = source.subscribe(new Observer(
                value -> {
                    if (done[0]) return;
                    count[0]++;
                    obs.next.accept(value);
                    if (count[0] >= n) {
                        done[0] = true;
                        obs.complete.run();
                        if (holder[0] != null) holder[0].unsubscribe();
                    }
                },
                obs.complete
            ));
            return holder[0];
        };
    }

    public static void main(String[] args) {
        take(naturals(), 3).subscribe(new Observer(
                v -> System.out.println(v),
                () -> System.out.println("completed")
        ));
    }
}
