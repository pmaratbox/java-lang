// Java — vavr via jbang. Run: jbang FpMap.java
//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class FpMap {
  public static void main(String[] args) {
    System.out.println(List.of(1, 2, 3).map(x -> x * 2).mkString(","));
  }
}
