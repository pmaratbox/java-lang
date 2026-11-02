import java.util.stream.Collectors;
import java.util.stream.Stream;

void main() {
    var out = Stream.iterate(1, n -> n + 1)
            .filter(n -> n % 2 == 0)
            .limit(3)
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
    IO.println(out);
}
