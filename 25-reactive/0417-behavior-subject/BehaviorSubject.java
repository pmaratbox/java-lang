import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BehaviorSubject {
    static final class Subject<T> {
        private T current;
        private final List<Consumer<T>> observers = new ArrayList<>();

        Subject(T seed) {
            this.current = seed;
        }

        void subscribe(Consumer<T> observer) {
            observers.add(observer);
            observer.accept(current); // replay current value immediately
        }

        void next(T value) {
            current = value;
            for (Consumer<T> observer : new ArrayList<>(observers)) {
                observer.accept(value);
            }
        }
    }

    public static void main(String[] args) {
        Subject<Integer> subject = new Subject<>(0);

        subject.subscribe(v -> System.out.println("A: " + v));
        subject.next(1);
        subject.subscribe(v -> System.out.println("B: " + v));
        subject.next(2);
    }
}
