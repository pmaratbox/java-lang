import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

static IntUnaryOperator partial(IntBinaryOperator f, int a) {
    return b -> f.applyAsInt(a, b);
}

void main() {
    IntBinaryOperator add = (a, b) -> a + b;
    var add10 = partial(add, 10);
    IO.println(add10.applyAsInt(3));
}
