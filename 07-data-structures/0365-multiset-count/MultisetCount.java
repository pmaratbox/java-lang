import java.util.HashMap;
import java.util.Map;

public class MultisetCount {
    private final Map<Integer, Integer> counts = new HashMap<>();

    void add(int element) {
        counts.merge(element, 1, Integer::sum);
    }

    void remove(int element) {
        counts.computeIfPresent(element, (k, v) -> v > 1 ? v - 1 : null);
    }

    int count(int element) {
        return counts.getOrDefault(element, 0);
    }

    void main() {
        var ms = new MultisetCount();
        ms.add(1);
        ms.add(1);
        ms.add(2);
        var before = ms.count(1);
        ms.remove(1);
        var after = ms.count(1);
        System.out.println(before + " " + after);
    }
}
