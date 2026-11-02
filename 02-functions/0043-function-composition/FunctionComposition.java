import java.util.function.Function;

void main() {
    Function<Integer, Integer> inc = x -> x + 1;
    Function<Integer, Integer> twice = x -> x * 2;
    var composed = inc.compose(twice);
    IO.println(composed.apply(3));
}
