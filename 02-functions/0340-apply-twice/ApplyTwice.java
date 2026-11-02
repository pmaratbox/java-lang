import java.util.function.Function;

static <T> T applyTwice(Function<T, T> f, T x) {
    return f.apply(f.apply(x));
}

void main() {
    Function<Integer, Integer> inc = n -> n + 1;
    System.out.println(applyTwice(inc, 3));
}
