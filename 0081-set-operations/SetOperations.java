import java.util.List;
import java.util.TreeSet;
import java.util.StringJoiner;

public class SetOperations {
    static String join(TreeSet<Integer> set) {
        StringJoiner j = new StringJoiner(" ");
        for (int x : set) j.add(String.valueOf(x));
        return j.toString();
    }

    public static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet<>(List.of(1, 2, 3));
        TreeSet<Integer> b = new TreeSet<>(List.of(2, 3, 4));

        TreeSet<Integer> union = new TreeSet<>(a);
        union.addAll(b);

        TreeSet<Integer> inter = new TreeSet<>(a);
        inter.retainAll(b);

        System.out.println(join(union));
        System.out.println(join(inter));
    }
}
