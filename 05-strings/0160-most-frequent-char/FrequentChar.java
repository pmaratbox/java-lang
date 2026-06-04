import java.util.LinkedHashMap;
import java.util.Map;

public class FrequentChar {
    public static void main(String[] args) {
        String s = "hello";
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            counts.merge(c, 1, Integer::sum);
        }
        char best = s.charAt(0);
        int max = 0;
        for (Map.Entry<Character, Integer> e : counts.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                best = e.getKey();
            }
        }
        System.out.println(best);
    }
}
