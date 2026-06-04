import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LazyTake {
    public static void main(String[] args) {
        String out = Stream.iterate(1, n -> n + 1)
                .limit(5)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(out);
    }
}
