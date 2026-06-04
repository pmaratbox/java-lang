import java.util.HashMap;
import java.util.Map;

public class MarkovDeterministic {
    public static void main(String[] args) {
        Map<String, String> next = new HashMap<>();
        next.put("A", "B");
        next.put("B", "C");
        next.put("C", "A");

        String state = "A";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            state = next.get(state);
            if (sb.length() > 0) sb.append(' ');
            sb.append(state);
        }
        System.out.println(sb.toString());
    }
}
