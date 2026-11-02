import java.util.function.IntUnaryOperator;
import java.util.function.IntFunction;

static IntFunction<IntUnaryOperator> add() {
    return a -> b -> a + b;
}

void main() {
    var add = add();
    IO.println(add.apply(2).applyAsInt(3));
}
