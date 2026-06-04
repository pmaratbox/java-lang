import java.util.Optional;
import java.util.function.IntUnaryOperator;

public class MapChain {
    public static void main(String[] args) {
        IntUnaryOperator plus2 = n -> n + 2;

        Optional<Integer> present = Optional.of(10);
        Optional<Integer> absent = Optional.empty();

        String a = present.map(plus2::applyAsInt).map(String::valueOf).orElse("none");
        String b = absent.map(plus2::applyAsInt).map(String::valueOf).orElse("none");

        System.out.println(a + " " + b);
    }
}
