//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

void main() {
    var original = List.of(1, 2, 3, 4, 5);
    // filter then map each return a brand-new immutable list;
    // `original` is never mutated.
    var result = original
            .filter(n -> n % 2 == 0)
            .map(n -> n * 10);
    IO.println(result.mkString(" "));
}
