import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Difference {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 3, 4);
        Set<Integer> remove = Set.of(2, 4);
        String result = a.stream()
                .filter(n -> !remove.contains(n))
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
