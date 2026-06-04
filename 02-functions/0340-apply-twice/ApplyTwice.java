import java.util.function.Function;

public class ApplyTwice {
    static <T> T applyTwice(Function<T, T> f, T x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        Function<Integer, Integer> inc = n -> n + 1;
        System.out.println(applyTwice(inc, 3));
    }
}
