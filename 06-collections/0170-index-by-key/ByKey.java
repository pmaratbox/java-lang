import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

record Person(int id, String name) {}

void main() {
    var people = List.of(new Person(1, "alice"), new Person(2, "bob"));
    Map<Integer, String> byId = new LinkedHashMap<>();
    for (var p : people) {
        byId.put(p.id(), p.name());
    }
    IO.println("id 2: " + byId.get(2));
}
