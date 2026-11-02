//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

void main() {
    var result = List.of(1, 2, 3)
        .flatMap(x -> List.of(x, x * 10))
        .mkString(",");
    IO.println(result);
}
