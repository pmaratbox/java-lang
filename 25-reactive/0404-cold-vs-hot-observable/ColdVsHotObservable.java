import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// A cold observable re-runs its producer for each subscriber; a hot one shares
// a single execution, so subscribers that arrive late miss earlier values.
public class ColdVsHotObservable {

    // Observer is just a callback that receives "next" values.
    // Cold observable: subscribe() runs the producer fresh per subscriber.
    static final class Cold {
        private final Consumer<Consumer<Integer>> producer;

        Cold(Consumer<Consumer<Integer>> producer) {
            this.producer = producer;
        }

        void subscribe(Consumer<Integer> observer) {
            producer.accept(observer); // independent execution each time
        }
    }

    // Hot observable: one shared producer; emit() pushes to current subscribers.
    static final class Hot {
        private final List<Consumer<Integer>> observers = new ArrayList<>();

        void subscribe(Consumer<Integer> observer) {
            observers.add(observer);
        }

        void emit(int value) {
            for (Consumer<Integer> o : observers) {
                o.accept(value);
            }
        }
    }

    private static String join(List<Integer> values) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) sb.append(' ');
            sb.append(values.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // COLD: each subscription independently runs the producer 1 2 3.
        Cold cold = new Cold(observer -> {
            observer.accept(1);
            observer.accept(2);
            observer.accept(3);
        });

        List<Integer> coldA = new ArrayList<>();
        List<Integer> coldB = new ArrayList<>();
        cold.subscribe(coldA::add);
        cold.subscribe(coldB::add);

        System.out.println("cold A: " + join(coldA));
        System.out.println("cold B: " + join(coldB));

        // HOT: one shared producer; A subscribes, emit 1, then B subscribes,
        // then emit 2 and 3 to both. B misses the earlier 1.
        Hot hot = new Hot();
        List<Integer> hotA = new ArrayList<>();
        List<Integer> hotB = new ArrayList<>();

        hot.subscribe(hotA::add);
        hot.emit(1);
        hot.subscribe(hotB::add);
        hot.emit(2);
        hot.emit(3);

        System.out.println("hot A: " + join(hotA));
        System.out.println("hot B: " + join(hotB));
    }
}
