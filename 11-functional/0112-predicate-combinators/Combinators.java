import java.util.function.IntPredicate;

static IntPredicate and(IntPredicate p, IntPredicate q) {
    return n -> p.test(n) && q.test(n);
}

void main() {
    IntPredicate isEven = n -> n % 2 == 0;
    IntPredicate isPositive = n -> n > 0;
    var both = and(isEven, isPositive);
    var a = both.test(4) ? "yes" : "no";
    var b = both.test(-4) ? "yes" : "no";
    IO.println(a + " " + b);
}
