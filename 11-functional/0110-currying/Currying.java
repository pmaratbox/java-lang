import java.util.function.IntUnaryOperator;
import java.util.function.IntFunction;

public class Currying {
    static IntFunction<IntUnaryOperator> add() {
        return a -> b -> a + b;
    }

    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> add = add();
        System.out.println(add.apply(2).applyAsInt(3));
    }
}
