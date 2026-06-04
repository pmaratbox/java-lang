import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KFrequent {
    public static void main(String[] args) {
        List<String> items = List.of("a", "b", "a", "c", "b", "a");
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String s : items) {
            counts.merge(s, 1, Integer::sum);
        }
        String result = counts.entrySet().stream()
                .sorted((x, y) -> y.getValue() - x.getValue())
                .limit(2)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
