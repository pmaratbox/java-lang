import java.util.function.IntUnaryOperator;

public class HigherOrder {
    static int apply(IntUnaryOperator f, int x) {
        return f.applyAsInt(x);
    }

    public static void main(String[] args) {
        IntUnaryOperator inc = x -> x + 1;
        IntUnaryOperator dbl = x -> x * 2;

        System.out.println("inc 5 = " + apply(inc, 5));
        System.out.println("double 5 = " + apply(dbl, 5));
    }
}
