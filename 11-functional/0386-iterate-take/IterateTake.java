import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateTake {
    public static void main(String[] args) {
        String out = Stream.iterate(1, x -> x * 3)
                .limit(4)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(out);
    }
}
