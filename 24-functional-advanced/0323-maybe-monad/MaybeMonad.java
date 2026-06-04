import java.util.function.Function;

public class MaybeMonad {
    public static void main(String[] args) {
        Maybe<Integer> present = Maybe.some(2)
                .bind(x -> Maybe.some(x + 3))
                .bind(x -> Maybe.some(x * 2));
        Maybe<Integer> absent = Maybe.<Integer>none()
                .bind(x -> Maybe.some(x + 3))
                .bind(x -> Maybe.some(x * 2));

        String a = present.map(String::valueOf).orElse("none");
        String b = absent.map(String::valueOf).orElse("none");
        System.out.println(a + " " + b);
    }
}

final class Maybe<T> {
    private final T value;
    private final boolean present;

    private Maybe(T value, boolean present) {
        this.value = value;
        this.present = present;
    }

    static <T> Maybe<T> some(T v) { return new Maybe<>(v, true); }
    static <T> Maybe<T> none() { return new Maybe<>(null, false); }

    <R> Maybe<R> bind(Function<T, Maybe<R>> f) {
        return present ? f.apply(value) : Maybe.none();
    }

    <R> Maybe<R> map(Function<T, R> f) {
        return present ? Maybe.some(f.apply(value)) : Maybe.none();
    }

    T orElse(T fallback) { return present ? value : fallback; }
}
