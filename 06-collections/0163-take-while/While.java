import java.util.List;
import java.util.stream.Collectors;

public class While {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 1);
        String result = nums.stream()
                .takeWhile(n -> n < 3)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
