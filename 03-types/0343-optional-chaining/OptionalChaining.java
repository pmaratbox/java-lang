import java.util.Optional;

public class OptionalChaining {
    record C(int value) {}
    record B(Optional<C> c) {}
    record A(Optional<B> b) {}

    static int read(A a) {
        return a.b().flatMap(B::c).map(C::value).orElse(0);
    }

    public static void main(String[] args) {
        A present = new A(Optional.of(new B(Optional.of(new C(5)))));
        A absent = new A(Optional.of(new B(Optional.empty())));
        System.out.println(read(present) + " " + read(absent));
    }
}
