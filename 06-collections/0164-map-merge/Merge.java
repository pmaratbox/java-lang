import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Merge {
    public static void main(String[] args) {
        Map<String, Integer> left = new LinkedHashMap<>();
        left.put("a", 1);
        left.put("b", 2);
        Map<String, Integer> right = new LinkedHashMap<>();
        right.put("b", 3);
        right.put("c", 4);

        Map<String, Integer> merged = new TreeMap<>(left);
        right.forEach((k, v) -> merged.put(k, v));

        String result = merged.entrySet().stream()
                .map(e -> e.getKey() + ":" + e.getValue())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
