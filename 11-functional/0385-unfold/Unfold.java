import java.util.stream.Collectors;
import java.util.stream.Stream;

void main() {
    var out = Stream.iterate(1, x -> x * 2)
            .limit(5)
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
    System.out.println(out);
}
