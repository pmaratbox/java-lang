//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

void main() {
    var original = List.of(1, 2, 3);
    var updated = original.append(4);
    IO.println(updated.mkString(" "));
    IO.println(original.mkString(" "));
}
