import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

static final class EventEmitter {
    private final Map<String, List<Consumer<String>>> handlers = new HashMap<>();

    void on(String topic, Consumer<String> handler) {
        handlers.computeIfAbsent(topic, k -> new ArrayList<>()).add(handler);
    }

    void emit(String topic, String payload) {
        var list = handlers.get(topic);
        if (list == null) return;
        for (var h : new ArrayList<>(list)) {
            h.accept(payload);
        }
    }

    void off(String topic, Consumer<String> handler) {
        var list = handlers.get(topic);
        if (list != null) list.remove(handler);
    }
}

void main() {
    var bus = new EventEmitter();
    Consumer<String> h = payload -> IO.println("hi " + payload);
    Consumer<String> g = payload -> IO.println("bye " + payload);

    bus.on("greet", h);
    bus.on("bye", g);

    bus.emit("greet", "ada");
    bus.emit("bye", "ada");

    bus.off("greet", h);
    bus.emit("greet", "x");
}
