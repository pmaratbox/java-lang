import java.util.List;
import java.util.function.Function;

void main() {
    Function<Integer, Integer> square = x -> x * x;
    Function<List<Integer>, List<Integer>> mapSquare =
            xs -> xs.stream().map(square).toList();
    Function<List<Integer>, Integer> sum =
            xs -> xs.stream().reduce(0, Integer::sum);

    var sumOfSquares = mapSquare.andThen(sum);

    IO.println(sumOfSquares.apply(List.of(1, 2, 3)));
}
