//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class UpdateElement {
    public static void main(String[] args) {
        // Vavr's persistent List is immutable.
        List<Integer> original = List.of(1, 2, 3);
        // .update(index, value) RETURNS A NEW list; the original is untouched.
        List<Integer> updated = original.update(0, 99);
        System.out.println(updated.mkString(" "));
        System.out.println(original.mkString(" "));
    }
}
