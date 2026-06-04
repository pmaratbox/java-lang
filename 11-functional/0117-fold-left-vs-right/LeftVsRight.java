import java.util.function.IntBinaryOperator;

public class LeftVsRight {
    static int foldl(IntBinaryOperator f, int init, int[] xs) {
        int acc = init;
        for (int x : xs) acc = f.applyAsInt(acc, x);
        return acc;
    }

    static int foldr(IntBinaryOperator f, int init, int[] xs) {
        int acc = init;
        for (int i = xs.length - 1; i >= 0; i--) acc = f.applyAsInt(xs[i], acc);
        return acc;
    }

    public static void main(String[] args) {
        IntBinaryOperator sub = (a, b) -> a - b;
        int[] xs = {1, 2, 3};
        System.out.println(foldl(sub, 0, xs) + " " + foldr(sub, 0, xs));
    }
}
