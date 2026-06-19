//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class FpFlatMap {
    public static void main(String[] args) {
        String result = List.of(1, 2, 3)
            .flatMap(x -> List.of(x, x * 10))
            .mkString(",");
        System.out.println(result);
    }
}
