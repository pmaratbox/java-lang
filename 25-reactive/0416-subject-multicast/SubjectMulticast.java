import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

static final class Subject<T> {
    private final List<Consumer<T>> observers = new ArrayList<>();

    void subscribe(Consumer<T> observer) {
        observers.add(observer);
    }

    void next(T value) {
        for (var observer : observers) {
            observer.accept(value);
        }
    }
}

void main() {
    Subject<Integer> subject = new Subject<>();
    subject.subscribe(v -> System.out.println("obs1: " + v));
    subject.subscribe(v -> System.out.println("obs2: " + v));
    subject.next(1);
    subject.next(2);
}
