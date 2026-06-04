import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Unfold {
    public static void main(String[] args) {
        String out = Stream.iterate(1, x -> x * 2)
                .limit(5)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(out);
    }
}
