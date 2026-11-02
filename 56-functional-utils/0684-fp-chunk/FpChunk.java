//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

void main() {
  // vavr List.grouped(n) splits into fixed-size chunks (a lazy-friendly window).
  var result = List.rangeClosed(1, 6)
      .grouped(2)
      .map(chunk -> chunk.mkString(","))
      .mkString("|");
  IO.println(result);
}
