import java.util.stream.Collectors;
import java.util.stream.Stream;

void main() {
    var result = Stream.iterate(1, n -> n + 1)
        .map(n -> n * n)
        .limit(3)
        .map(String::valueOf)
        .collect(Collectors.joining(" "));
    IO.println(result);
}
