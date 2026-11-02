import java.util.List;
import java.util.Comparator;

void main() {
    var words = List.of("a", "bbb", "cc");
    var longest = words.stream()
            .max(Comparator.comparingInt(String::length))
            .orElseThrow();
    IO.println(longest);
}
