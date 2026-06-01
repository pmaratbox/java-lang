import java.util.Map;

public class MapTransform {
    public static void main(String[] args) {
        Map<String, Integer> scores = Map.of("a", 1, "b", 2, "c", 3);
        int total = scores.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum: " + total);
    }
}
