import java.util.function.IntUnaryOperator;

static IntUnaryOperator pipe(IntUnaryOperator... fns) {
    IntUnaryOperator out = x -> x;
    for (var f : fns) out = out.andThen(f);
    return out;
}

void main() {
    IntUnaryOperator inc = x -> x + 1;
    IntUnaryOperator dbl = x -> x * 2;
    IntUnaryOperator neg = x -> -x;
    var p = pipe(inc, dbl, neg);
    System.out.println(p.applyAsInt(3));
}
