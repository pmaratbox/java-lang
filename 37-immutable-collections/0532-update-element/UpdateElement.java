//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

void main() {
    // Vavr's persistent List is immutable.
    var original = List.of(1, 2, 3);
    // .update(index, value) RETURNS A NEW list; the original is untouched.
    var updated = original.update(0, 99);
    IO.println(updated.mkString(" "));
    IO.println(original.mkString(" "));
}
