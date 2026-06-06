import java.util.function.Consumer;

public class ObservableCreate {

    // An observer is a pair of callbacks: next(value) and complete().
    static final class Observer<T> {
        final Consumer<T> next;
        final Runnable complete;

        Observer(Consumer<T> next, Runnable complete) {
            this.next = next;
            this.complete = complete;
        }
    }

    // An Observable is a function taking an observer; subscribe wires producer to it.
    @FunctionalInterface
    interface Observable<T> {
        void subscribe(Observer<T> observer);
    }

    public static void main(String[] args) {
        Observable<Integer> source = observer -> {
            observer.next.accept(1);
            observer.next.accept(2);
            observer.next.accept(3);
            observer.complete.run();
        };

        source.subscribe(new Observer<>(
                value -> System.out.println(value),
                () -> System.out.println("done")
        ));
    }
}
