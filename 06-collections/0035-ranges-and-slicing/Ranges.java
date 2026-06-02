import java.util.List;
import java.util.stream.Collectors;

public class Ranges {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        String slice = nums.subList(1, 4).stream()
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
        System.out.println("slice: " + slice);
    }
}
