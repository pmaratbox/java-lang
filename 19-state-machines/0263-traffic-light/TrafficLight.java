import java.util.HashMap;
import java.util.Map;

public class TrafficLight {
    public static void main(String[] args) {
        Map<String, String> next = new HashMap<>();
        next.put("red", "green");
        next.put("green", "yellow");
        next.put("yellow", "red");

        String state = "red";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            state = next.get(state);
            if (sb.length() > 0) sb.append(' ');
            sb.append(state);
        }
        System.out.println(sb.toString());
    }
}
