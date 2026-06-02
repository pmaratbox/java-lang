import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.StringJoiner;

public class GroupBy {
    public static void main(String[] args) {
        List<String> words = List.of("one", "two", "three");
        Map<Integer, List<String>> groups = new TreeMap<>();
        for (String w : words) {
            groups.computeIfAbsent(w.length(), k -> new ArrayList<>()).add(w);
        }

        StringJoiner out = new StringJoiner(" ");
        for (Map.Entry<Integer, List<String>> e : groups.entrySet()) {
            out.add(e.getKey() + ":[" + String.join(",", e.getValue()) + "]");
        }
        System.out.println(out);
    }
}
