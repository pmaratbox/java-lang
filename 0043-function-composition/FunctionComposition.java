import java.util.function.Function;

public class FunctionComposition {
    public static void main(String[] args) {
        Function<Integer, Integer> inc = x -> x + 1;
        Function<Integer, Integer> twice = x -> x * 2;
        Function<Integer, Integer> composed = inc.compose(twice);
        System.out.println(composed.apply(3));
    }
}
