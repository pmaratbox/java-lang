import java.util.List;
import java.util.stream.Collectors;

void main() {
    var nums = List.of(10, 20, 30, 40, 50);
    var slice = nums.subList(1, 4).stream()
        .map(String::valueOf)
        .collect(Collectors.joining(" "));
    System.out.println("slice: " + slice);
}
