//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.HashMap;
import io.vavr.collection.Map;

public class NestedUpdate {
    public static void main(String[] args) {
        // Immutable nested map: {user: {age: 30}}
        Map<String, Map<String, Integer>> original =
            HashMap.of("user", HashMap.of("age", 30));

        // Update the nested user.age to 31 -> returns a NEW map.
        // .computeIfPresent transforms the inner map immutably; .put on the
        // inner map also returns a new map, so nothing is mutated in place.
        Map<String, Map<String, Integer>> updated = original.put(
            "user",
            original.get("user").get().put("age", 31));

        // New map reflects the change; the original is unchanged.
        System.out.println(updated.get("user").get().get("age").get());
        System.out.println(original.get("user").get().get("age").get());
    }
}
