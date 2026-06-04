import java.util.List;
import java.util.function.BinaryOperator;

public class MonoidFold {
    static <T> T fold(List<T> xs, T identity, BinaryOperator<T> combine) {
        T acc = identity;
        for (T x : xs) acc = combine.apply(acc, x);
        return acc;
    }

    public static void main(String[] args) {
        String s = fold(List.of("a", "b", "c"), "", (a, b) -> a + b);
        int n = fold(List.of(1, 2, 3), 0, Integer::sum);
        System.out.println(s + " " + n);
    }
}
