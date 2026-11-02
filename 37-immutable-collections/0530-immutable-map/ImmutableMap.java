//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.HashMap;
import io.vavr.collection.Map;

void main() {
    Map<String, Integer> original = HashMap.of("a", 1);
    Map<String, Integer> updated = original.put("b", 2);

    IO.println(updated.keySet().toSortedSet().mkString(" "));
    IO.println(original.keySet().toSortedSet().mkString(" "));
}
