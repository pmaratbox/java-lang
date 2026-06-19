//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class FpFilter {
  public static void main(String[] a) {
    // vavr's persistent List.filter keeps only elements matching the predicate.
    String out = List.rangeClosed(1, 6)
        .filter(x -> x % 2 == 0)
        .mkString(",");
    System.out.println(out);
  }
}
