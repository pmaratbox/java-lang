import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

public class CharFrequency {
    public static void main(String[] args) {
        String s = "aab";
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            counts.merge(c, 1, Integer::sum);
        }
        StringJoiner sj = new StringJoiner(" ");
        for (Map.Entry<Character, Integer> e : counts.entrySet()) {
            sj.add(e.getKey() + ":" + e.getValue());
        }
        System.out.println(sj.toString());
    }
}
