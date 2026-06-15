//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class PrependAppend {
    public static void main(String[] args) {
        List<Integer> original = List.of(2, 3);
        List<Integer> result = original.prepend(1).append(4);
        // prepend/append each return a NEW persistent list; `original` is unchanged.
        System.out.println(result.mkString(" "));
    }
}
