//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

void main() {
  var nested = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));
  var result = nested.flatMap(inner -> inner).mkString(",");
  System.out.println(result);
}
