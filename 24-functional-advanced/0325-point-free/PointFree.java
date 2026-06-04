import java.util.List;
import java.util.function.Function;

public class PointFree {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        Function<List<Integer>, List<Integer>> mapSquare =
                xs -> xs.stream().map(square).toList();
        Function<List<Integer>, Integer> sum =
                xs -> xs.stream().reduce(0, Integer::sum);

        Function<List<Integer>, Integer> sumOfSquares = mapSquare.andThen(sum);

        System.out.println(sumOfSquares.apply(List.of(1, 2, 3)));
    }
}
