//JAVA 26
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;
import java.util.Comparator;

void main() {
  var grouped = List.rangeClosed(1, 6).groupBy(x -> x % 2 == 0 ? "even" : "odd");
  var out = grouped
      .toSortedMap(Comparator.naturalOrder(), e -> e._1, e -> e._2)
      .map(e -> e._1 + ":" + e._2.mkString(","))
      .mkString(";");
  IO.println(out);
}
