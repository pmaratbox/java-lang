//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class FpFlatten {
  public static void main(String[] args) {
    List<List<Integer>> nested = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));
    String result = nested.flatMap(inner -> inner).mkString(",");
    System.out.println(result);
  }
}
