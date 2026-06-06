public class SubscribeUnsubscribe {

    // A Subscription lets the consumer stop receiving values.
    static final class Subscription {
        private boolean closed = false;

        boolean isClosed() {
            return closed;
        }

        void unsubscribe() {
            closed = true;
        }
    }

    // A producer pushes values into a bound Observer.
    interface Producer {
        void run(Observer observer);
    }

    // A push-based Observable implemented from scratch.
    static final class Observable {
        private final Producer producer;

        Observable(Producer producer) {
            this.producer = producer;
        }

        Subscription subscribe(Observer observer) {
            Subscription sub = new Subscription();
            observer.bind(sub);
            producer.run(observer);
            return sub;
        }
    }

    // The observer carries the subscription so the producer can check "closed".
    static final class Observer {
        private Subscription sub;

        boolean isClosed() {
            return sub != null && sub.isClosed();
        }

        void bind(Subscription sub) {
            this.sub = sub;
        }

        void next(int value) {
            System.out.println(value);
            // Unsubscribe after receiving 2 so later values are not delivered.
            if (value == 2) {
                sub.unsubscribe();
            }
        }
    }

    public static void main(String[] args) {
        // Source would push 1,2,3,4 but checks "closed" before each next.
        Observable source = new Observable(observer -> {
            int[] values = {1, 2, 3, 4};
            for (int v : values) {
                if (observer.isClosed()) {
                    return;
                }
                observer.next(v);
            }
        });

        source.subscribe(new Observer());
    }
}
