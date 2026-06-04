import java.util.function.IntUnaryOperator;

public class Pipeline {
    static IntUnaryOperator pipe(IntUnaryOperator... fns) {
        IntUnaryOperator out = x -> x;
        for (IntUnaryOperator f : fns) out = out.andThen(f);
        return out;
    }

    public static void main(String[] args) {
        IntUnaryOperator inc = x -> x + 1;
        IntUnaryOperator dbl = x -> x * 2;
        IntUnaryOperator neg = x -> -x;
        IntUnaryOperator p = pipe(inc, dbl, neg);
        System.out.println(p.applyAsInt(3));
    }
}
