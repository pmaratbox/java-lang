import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class ByKey {
    record Person(int id, String name) {}

    public static void main(String[] args) {
        List<Person> people = List.of(new Person(1, "alice"), new Person(2, "bob"));
        Map<Integer, String> byId = new LinkedHashMap<>();
        for (Person p : people) {
            byId.put(p.id(), p.name());
        }
        System.out.println("id 2: " + byId.get(2));
    }
}
