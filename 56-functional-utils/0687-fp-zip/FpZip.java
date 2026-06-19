//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class FpZip {
  public static void main(String[] args) {
    // Vavr's List.zip pairs elements positionally into a List<Tuple2>.
    String result = List.of(1, 2, 3)
        .zip(List.of("a", "b", "c"))
        .map(t -> t._1 + "" + t._2)
        .mkString(",");
    System.out.println(result);
  }
}
