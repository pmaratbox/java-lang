import java.util.List;
import java.util.function.BinaryOperator;

static <T> T fold(List<T> xs, T identity, BinaryOperator<T> combine) {
    var acc = identity;
    for (var x : xs) acc = combine.apply(acc, x);
    return acc;
}

void main() {
    var s = fold(List.of("a", "b", "c"), "", (a, b) -> a + b);
    int n = fold(List.of(1, 2, 3), 0, Integer::sum);
    System.out.println(s + " " + n);
}
