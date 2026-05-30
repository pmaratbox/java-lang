import java.util.List;

public class Generics {
    static <T> T first(List<T> items) {
        return items.get(0);
    }

    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3);
        List<String> strs = List.of("a", "b", "c");

        System.out.println("first int: " + first(ints));
        System.out.println("first string: " + first(strs));
    }
}
