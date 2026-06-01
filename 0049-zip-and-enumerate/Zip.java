import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zip {
    public static void main(String[] args) {
        List<String> letters = List.of("a", "b", "c");
        List<Integer> nums = List.of(1, 2, 3);
        String result = IntStream.range(0, letters.size())
            .mapToObj(i -> letters.get(i) + "=" + nums.get(i))
            .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
