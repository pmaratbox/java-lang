//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<Integer> original = List.of(1, 2, 3);
        List<Integer> updated = original.append(4);
        System.out.println(updated.mkString(" "));
        System.out.println(original.mkString(" "));
    }
}
