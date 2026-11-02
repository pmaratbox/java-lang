import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.StringJoiner;

void main() {
    Map<String, Integer> m = new HashMap<>();
    m.put("a", 1);
    m.put("b", 2);
    m.put("c", 3);
    TreeMap<Integer, String> inverted = new TreeMap<>();
    for (Map.Entry<String, Integer> e : m.entrySet()) {
        inverted.put(e.getValue(), e.getKey());
    }
    var out = new StringJoiner(" ");
    for (Map.Entry<Integer, String> e : inverted.entrySet()) {
        out.add(e.getKey() + ":" + e.getValue());
    }
    System.out.println(out);
}
