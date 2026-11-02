import java.util.HashMap;
import java.util.Map;

void main() {
    Map<String, String> next = new HashMap<>();
    next.put("A", "B");
    next.put("B", "C");
    next.put("C", "A");

    var state = "A";
    var sb = new StringBuilder();
    for (var i = 0; i < 3; i++) {
        state = next.get(state);
        if (sb.length() > 0) sb.append(' ');
        sb.append(state);
    }
    IO.println(sb.toString());
}
