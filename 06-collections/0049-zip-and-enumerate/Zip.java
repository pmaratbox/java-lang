import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

void main() {
    var letters = List.of("a", "b", "c");
    var nums = List.of(1, 2, 3);
    var result = IntStream.range(0, letters.size())
        .mapToObj(i -> letters.get(i) + "=" + nums.get(i))
        .collect(Collectors.joining(" "));
    System.out.println(result);
}
