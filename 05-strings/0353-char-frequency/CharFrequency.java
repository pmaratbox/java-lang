import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

void main() {
    var s = "aab";
    Map<Character, Integer> counts = new LinkedHashMap<>();
    for (var c : s.toCharArray()) {
        counts.merge(c, 1, Integer::sum);
    }
    var sj = new StringJoiner(" ");
    for (Map.Entry<Character, Integer> e : counts.entrySet()) {
        sj.add(e.getKey() + ":" + e.getValue());
    }
    IO.println(sj.toString());
}
