import java.util.function.IntPredicate;

public class Combinators {
    static IntPredicate and(IntPredicate p, IntPredicate q) {
        return n -> p.test(n) && q.test(n);
    }

    public static void main(String[] args) {
        IntPredicate isEven = n -> n % 2 == 0;
        IntPredicate isPositive = n -> n > 0;
        IntPredicate both = and(isEven, isPositive);
        String a = both.test(4) ? "yes" : "no";
        String b = both.test(-4) ? "yes" : "no";
        System.out.println(a + " " + b);
    }
}
