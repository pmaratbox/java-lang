import java.util.List;
import java.util.stream.Collectors;

void main() {
    var nested = List.of(List.of(1, 2), List.of(3, 4));
    var flat = nested.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());

    var out = flat.stream()
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
    IO.println(out);
}
