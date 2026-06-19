//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class FpChunk {
  public static void main(String[] args) {
    // vavr List.grouped(n) splits into fixed-size chunks (a lazy-friendly window).
    String result = List.rangeClosed(1, 6)
        .grouped(2)
        .map(chunk -> chunk.mkString(","))
        .mkString("|");
    System.out.println(result);
  }
}
