import java.util.List;
import java.util.Comparator;

public class ByKey {
    public static void main(String[] args) {
        List<String> words = List.of("a", "bbb", "cc");
        String longest = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElseThrow();
        System.out.println(longest);
    }
}
