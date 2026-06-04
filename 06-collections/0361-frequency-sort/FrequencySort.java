import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class FrequencySort {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 1, 2, 3, 3, 3);
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        for (int n : nums) {
            counts.merge(n, 1, Integer::sum);
        }
        StringJoiner sj = new StringJoiner(" ");
        counts.entrySet().stream()
            .sorted((x, y) -> Integer.compare(y.getValue(), x.getValue()))
            .forEach(e -> {
                for (int i = 0; i < e.getValue(); i++) {
                    sj.add(e.getKey().toString());
                }
            });
        System.out.println(sj);
    }
}
