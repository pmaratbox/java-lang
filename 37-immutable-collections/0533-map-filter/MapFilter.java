//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class MapFilter {
    public static void main(String[] args) {
        List<Integer> original = List.of(1, 2, 3, 4, 5);
        // filter then map each return a brand-new immutable list;
        // `original` is never mutated.
        List<Integer> result = original
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10);
        System.out.println(result.mkString(" "));
    }
}
