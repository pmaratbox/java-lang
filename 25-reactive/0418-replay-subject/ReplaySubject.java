import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.Consumer;

public class ReplaySubject {
    private final int bufferSize;
    private final Deque<Integer> buffer = new ArrayDeque<>();
    private final List<Consumer<Integer>> observers = new ArrayList<>();

    ReplaySubject(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    void next(int value) {
        if (buffer.size() == bufferSize) {
            buffer.pollFirst();
        }
        buffer.addLast(value);
        for (Consumer<Integer> observer : observers) {
            observer.accept(value);
        }
    }

    void subscribe(Consumer<Integer> observer) {
        for (int buffered : buffer) {
            observer.accept(buffered);
        }
        observers.add(observer);
    }

    public static void main(String[] args) {
        ReplaySubject subject = new ReplaySubject(2);
        subject.next(1);
        subject.next(2);
        subject.next(3);
        subject.subscribe(value -> System.out.println(value));
        subject.next(4);
    }
}
