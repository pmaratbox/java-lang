import java.util.Map;
import java.util.TreeMap;
import java.util.StringJoiner;

void main() {
    var word = "banana";
    Map<Character, Integer> counts = new TreeMap<>();
    for (var ch : word.toCharArray()) {
        counts.merge(ch, 1, Integer::sum);
    }

    var out = new StringJoiner(" ");
    for (Map.Entry<Character, Integer> e : counts.entrySet()) {
        out.add(e.getKey() + ":" + e.getValue());
    }
    IO.println(out);
}
