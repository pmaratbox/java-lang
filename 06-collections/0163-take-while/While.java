import java.util.List;
import java.util.stream.Collectors;

void main() {
    var nums = List.of(1, 2, 3, 4, 1);
    var result = nums.stream()
            .takeWhile(n -> n < 3)
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
    System.out.println(result);
}
