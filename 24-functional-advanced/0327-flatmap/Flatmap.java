import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmap {
    public static void main(String[] args) {
        String out = Stream.of(1, 2, 3)
                .flatMap(x -> Stream.of(x, x * 10))
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(out);
    }
}
