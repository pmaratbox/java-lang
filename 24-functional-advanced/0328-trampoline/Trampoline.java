import java.util.function.Supplier;

public class Trampoline {
    sealed interface Bounce<T> permits Done, More {}
    record Done<T>(T value) implements Bounce<T> {}
    record More<T>(Supplier<Bounce<T>> next) implements Bounce<T> {}

    static <T> T run(Bounce<T> b) {
        while (b instanceof More<T> m) {
            b = m.next().get();
        }
        return ((Done<T>) b).value();
    }

    static Bounce<Integer> sum(int n, int acc) {
        return n == 0 ? new Done<>(acc) : new More<>(() -> sum(n - 1, acc + n));
    }

    public static void main(String[] args) {
        System.out.println(run(sum(100, 0)));
    }
}
