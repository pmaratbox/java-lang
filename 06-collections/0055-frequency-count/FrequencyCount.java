import java.util.Map;
import java.util.TreeMap;
import java.util.StringJoiner;

public class FrequencyCount {
    public static void main(String[] args) {
        String word = "banana";
        Map<Character, Integer> counts = new TreeMap<>();
        for (char ch : word.toCharArray()) {
            counts.merge(ch, 1, Integer::sum);
        }

        StringJoiner out = new StringJoiner(" ");
        for (Map.Entry<Character, Integer> e : counts.entrySet()) {
            out.add(e.getKey() + ":" + e.getValue());
        }
        System.out.println(out);
    }
}
