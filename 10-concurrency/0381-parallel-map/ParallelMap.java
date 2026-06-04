import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelMap {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        String result = IntStream.of(input)
            .parallel()
            .mapToObj(x -> x * x)
            .collect(Collectors.collectingAndThen(
                Collectors.toList(),
                list -> list.stream().map(String::valueOf).collect(Collectors.joining(" "))));
        System.out.println(result);
    }
}
