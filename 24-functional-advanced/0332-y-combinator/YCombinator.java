import java.util.function.Function;

// Self-applying functional interface to enable a fixed point in Java.
interface Rec<F> {
    F apply(Rec<F> r);
}

static <A, B> Function<A, B> fix(
        Function<Function<A, B>, Function<A, B>> gen) {
    Rec<Function<A, B>> rec = r -> a -> gen.apply(r.apply(r)).apply(a);
    return rec.apply(rec);
}

void main() {
    Function<Function<Integer, Integer>, Function<Integer, Integer>> factGen =
            self -> n -> n == 0 ? 1 : n * self.apply(n - 1);

    var fact = fix(factGen);
    System.out.println(fact.apply(5));
}
