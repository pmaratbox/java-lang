import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

void main() {
    var a = List.of(1, 2, 3, 4);
    var remove = Set.of(2, 4);
    var result = a.stream()
            .filter(n -> !remove.contains(n))
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
    IO.println(result);
}
