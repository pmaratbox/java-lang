import java.util.Optional;
import java.util.function.IntUnaryOperator;

void main() {
    IntUnaryOperator plus2 = n -> n + 2;

    var present = Optional.of(10);
    Optional<Integer> absent = Optional.empty();

    var a = present.map(plus2::applyAsInt).map(String::valueOf).orElse("none");
    String b = absent.map(plus2::applyAsInt).map(String::valueOf).orElse("none");

    IO.println(a + " " + b);
}
