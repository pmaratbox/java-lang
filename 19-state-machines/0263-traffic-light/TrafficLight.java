import java.util.HashMap;
import java.util.Map;

void main() {
    Map<String, String> next = new HashMap<>();
    next.put("red", "green");
    next.put("green", "yellow");
    next.put("yellow", "red");

    var state = "red";
    var sb = new StringBuilder();
    for (var i = 0; i < 4; i++) {
        state = next.get(state);
        if (sb.length() > 0) sb.append(' ');
        sb.append(state);
    }
    IO.println(sb.toString());
}
