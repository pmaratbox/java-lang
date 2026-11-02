import java.util.Optional;

record C(int value) {}
record B(Optional<C> c) {}
record A(Optional<B> b) {}

static int read(A a) {
    return a.b().flatMap(B::c).map(C::value).orElse(0);
}

void main() {
    var present = new A(Optional.of(new B(Optional.of(new C(5)))));
    var absent = new A(Optional.of(new B(Optional.empty())));
    IO.println(read(present) + " " + read(absent));
}
