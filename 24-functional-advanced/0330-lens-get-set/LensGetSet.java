import java.util.function.BiFunction;
import java.util.function.Function;

public class LensGetSet {
    record Inner(int b) {}
    record Outer(Inner a) {}

    static final class Lens<S, A> {
        final Function<S, A> get;
        final BiFunction<S, A, S> set;
        Lens(Function<S, A> get, BiFunction<S, A, S> set) {
            this.get = get;
            this.set = set;
        }
    }

    public static void main(String[] args) {
        Lens<Outer, Inner> aLens =
                new Lens<>(Outer::a, (o, a) -> new Outer(a));
        Lens<Inner, Integer> bLens =
                new Lens<>(Inner::b, (i, b) -> new Inner(b));

        Outer outer = new Outer(new Inner(1));

        int got = bLens.get.apply(aLens.get.apply(outer));
        Outer updated = aLens.set.apply(
                outer, bLens.set.apply(aLens.get.apply(outer), 2));
        int after = bLens.get.apply(aLens.get.apply(updated));

        System.out.println(got + " " + after);
    }
}
