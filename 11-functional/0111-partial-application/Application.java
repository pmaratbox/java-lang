import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class Application {
    static IntUnaryOperator partial(IntBinaryOperator f, int a) {
        return b -> f.applyAsInt(a, b);
    }

    public static void main(String[] args) {
        IntBinaryOperator add = (a, b) -> a + b;
        IntUnaryOperator add10 = partial(add, 10);
        System.out.println(add10.applyAsInt(3));
    }
}
