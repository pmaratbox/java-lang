//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;
import java.util.Comparator;

public class FpGroupBy {
  public static void main(String[] args) {
    var grouped = List.rangeClosed(1, 6).groupBy(x -> x % 2 == 0 ? "even" : "odd");
    String out = grouped
        .toSortedMap(Comparator.naturalOrder(), e -> e._1, e -> e._2)
        .map(e -> e._1 + ":" + e._2.mkString(","))
        .mkString(";");
    System.out.println(out);
  }
}
