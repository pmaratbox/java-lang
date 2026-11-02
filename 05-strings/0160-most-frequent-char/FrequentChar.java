import java.util.LinkedHashMap;
import java.util.Map;

void main() {
    var s = "hello";
    Map<Character, Integer> counts = new LinkedHashMap<>();
    for (var c : s.toCharArray()) {
        counts.merge(c, 1, Integer::sum);
    }
    var best = s.charAt(0);
    var max = 0;
    for (Map.Entry<Character, Integer> e : counts.entrySet()) {
        if (e.getValue() > max) {
            max = e.getValue();
            best = e.getKey();
        }
    }
    System.out.println(best);
}
