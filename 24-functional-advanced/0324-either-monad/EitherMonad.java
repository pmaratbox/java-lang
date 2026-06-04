import java.util.function.Function;

public class EitherMonad {
    public static void main(String[] args) {
        Either<String, Integer> ok = Either.<String, Integer>right(20)
                .bind(x -> divide(x, 5))
                .bind(x -> divide(x, 2));
        Either<String, Integer> bad = Either.<String, Integer>right(20)
                .bind(x -> divide(x, 0))
                .bind(x -> divide(x, 2));

        String a = ok.fold(err -> err, val -> String.valueOf(val));
        String b = bad.fold(err -> err, val -> String.valueOf(val));
        System.out.println(a + " " + b);
    }

    static Either<String, Integer> divide(int a, int b) {
        return b == 0 ? Either.left("err") : Either.right(a / b);
    }
}

final class Either<L, R> {
    private final L left;
    private final R right;
    private final boolean isRight;

    private Either(L left, R right, boolean isRight) {
        this.left = left;
        this.right = right;
        this.isRight = isRight;
    }

    static <L, R> Either<L, R> right(R r) { return new Either<>(null, r, true); }
    static <L, R> Either<L, R> left(L l) { return new Either<>(l, null, false); }

    <R2> Either<L, R2> bind(Function<R, Either<L, R2>> f) {
        return isRight ? f.apply(right) : Either.left(left);
    }

    <T> T fold(Function<L, T> onLeft, Function<R, T> onRight) {
        return isRight ? onRight.apply(right) : onLeft.apply(left);
    }
}
