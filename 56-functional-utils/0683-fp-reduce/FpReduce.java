// Java — vavr via jbang. Run: jbang FpReduce.java
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class FpReduce {
  public static void main(String[] args) {
    // foldLeft reduces the list to a single value, starting from init 0.
    int sum = List.rangeClosed(1, 5).foldLeft(0, Integer::sum);
    System.out.println(sum); // 15
  }
}
