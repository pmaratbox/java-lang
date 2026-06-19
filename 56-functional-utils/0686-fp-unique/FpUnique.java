//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class FpUnique {
  public static void main(String[] args) {
    List<Integer> nums = List.of(1, 2, 2, 3, 3, 3);
    String result = nums.distinct().mkString(",");
    System.out.println(result);
  }
}
