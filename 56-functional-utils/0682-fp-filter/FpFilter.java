//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

void main() {
  // vavr's persistent List.filter keeps only elements matching the predicate.
  var out = List.rangeClosed(1, 6)
      .filter(x -> x % 2 == 0)
      .mkString(",");
  IO.println(out);
}
