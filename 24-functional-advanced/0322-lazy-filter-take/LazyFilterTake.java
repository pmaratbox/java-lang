import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyFilterTake {
    public static void main(String[] args) {
        String out = Stream.iterate(1, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .limit(3)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(out);
    }
}
