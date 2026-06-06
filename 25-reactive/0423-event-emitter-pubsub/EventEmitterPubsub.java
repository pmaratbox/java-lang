import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class EventEmitterPubsub {
    static final class EventEmitter {
        private final Map<String, List<Consumer<String>>> handlers = new HashMap<>();

        void on(String topic, Consumer<String> handler) {
            handlers.computeIfAbsent(topic, k -> new ArrayList<>()).add(handler);
        }

        void emit(String topic, String payload) {
            List<Consumer<String>> list = handlers.get(topic);
            if (list == null) return;
            for (Consumer<String> h : new ArrayList<>(list)) {
                h.accept(payload);
            }
        }

        void off(String topic, Consumer<String> handler) {
            List<Consumer<String>> list = handlers.get(topic);
            if (list != null) list.remove(handler);
        }
    }

    public static void main(String[] args) {
        EventEmitter bus = new EventEmitter();
        Consumer<String> h = payload -> System.out.println("hi " + payload);
        Consumer<String> g = payload -> System.out.println("bye " + payload);

        bus.on("greet", h);
        bus.on("bye", g);

        bus.emit("greet", "ada");
        bus.emit("bye", "ada");

        bus.off("greet", h);
        bus.emit("greet", "x");
    }
}
