import java.util.function.IntBinaryOperator;

static int foldl(IntBinaryOperator f, int init, int[] xs) {
    var acc = init;
    for (var x : xs) acc = f.applyAsInt(acc, x);
    return acc;
}

static int foldr(IntBinaryOperator f, int init, int[] xs) {
    var acc = init;
    for (var i = xs.length - 1; i >= 0; i--) acc = f.applyAsInt(xs[i], acc);
    return acc;
}

void main() {
    IntBinaryOperator sub = (a, b) -> a - b;
    int[] xs = {1, 2, 3};
    IO.println(foldl(sub, 0, xs) + " " + foldr(sub, 0, xs));
}
