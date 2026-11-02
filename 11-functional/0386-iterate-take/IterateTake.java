import java.util.stream.Collectors;
import java.util.stream.Stream;

void main() {
    var out = Stream.iterate(1, x -> x * 3)
            .limit(4)
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
    IO.println(out);
}
