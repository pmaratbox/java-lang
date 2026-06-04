import java.util.function.Function;

public class CpsFactorial {
    static int factCps(int n, Function<Integer, Integer> k) {
        if (n == 0) return k.apply(1);
        return factCps(n - 1, r -> k.apply(n * r));
    }

    public static void main(String[] args) {
        System.out.println(factCps(5, x -> x));
    }
}
