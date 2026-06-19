//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class FpTake {
  public static void main(String[] args) {
    System.out.println(List.rangeClosed(1, 10).take(3).mkString(","));
  }
}
