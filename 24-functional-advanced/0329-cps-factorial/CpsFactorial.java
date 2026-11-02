import java.util.function.Function;

static int factCps(int n, Function<Integer, Integer> k) {
    if (n == 0) return k.apply(1);
    return factCps(n - 1, r -> k.apply(n * r));
}

void main() {
    IO.println(factCps(5, x -> x));
}
