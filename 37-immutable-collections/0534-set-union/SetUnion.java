//DEPS io.vavr:vavr:0.10.4
import io.vavr.collection.HashSet;
import io.vavr.collection.Set;
public class SetUnion {
    public static void main(String[] x) {
        Set<Integer> a = HashSet.of(1, 2, 3);
        Set<Integer> b = HashSet.of(3, 4, 5);
        Set<Integer> u = a.union(b);
        System.out.println(u.toSortedSet().mkString(" "));
    }
}
