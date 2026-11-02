//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

void main() {
    var original = List.of(2, 3);
    var result = original.prepend(1).append(4);
    // prepend/append each return a NEW persistent list; `original` is unchanged.
    IO.println(result.mkString(" "));
}
