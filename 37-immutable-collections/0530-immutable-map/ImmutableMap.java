//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.HashMap;
import io.vavr.collection.Map;

public class ImmutableMap {
    public static void main(String[] args) {
        Map<String, Integer> original = HashMap.of("a", 1);
        Map<String, Integer> updated = original.put("b", 2);

        System.out.println(updated.keySet().toSortedSet().mkString(" "));
        System.out.println(original.keySet().toSortedSet().mkString(" "));
    }
}
