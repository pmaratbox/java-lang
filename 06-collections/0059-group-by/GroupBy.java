import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.StringJoiner;

void main() {
    var words = List.of("one", "two", "three");
    Map<Integer, List<String>> groups = new TreeMap<>();
    for (var w : words) {
        groups.computeIfAbsent(w.length(), k -> new ArrayList<>()).add(w);
    }

    var out = new StringJoiner(" ");
    for (Map.Entry<Integer, List<String>> e : groups.entrySet()) {
        out.add(e.getKey() + ":[" + String.join(",", e.getValue()) + "]");
    }
    System.out.println(out);
}
