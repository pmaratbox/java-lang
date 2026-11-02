import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

void main() {
    Map<String, Integer> scores = new HashMap<>();
    scores.put("a", 3);
    scores.put("b", 1);
    scores.put("c", 2);
    List<Map.Entry<String, Integer>> entries = new ArrayList<>(scores.entrySet());
    entries.sort(Map.Entry.comparingByValue());
    var out = new StringJoiner(" ");
    for (Map.Entry<String, Integer> e : entries) out.add(e.getKey() + ":" + e.getValue());
    System.out.println(out);
}
