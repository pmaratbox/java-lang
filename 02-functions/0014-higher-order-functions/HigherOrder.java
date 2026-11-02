import java.util.function.IntUnaryOperator;

static int apply(IntUnaryOperator f, int x) {
    return f.applyAsInt(x);
}

void main() {
    IntUnaryOperator inc = x -> x + 1;
    IntUnaryOperator dbl = x -> x * 2;

    System.out.println("inc 5 = " + apply(inc, 5));
    System.out.println("double 5 = " + apply(dbl, 5));
}
