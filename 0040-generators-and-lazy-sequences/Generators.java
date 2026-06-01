import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generators {
    public static void main(String[] args) {
        String result = Stream.iterate(1, n -> n + 1)
            .map(n -> n * n)
            .limit(3)
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
