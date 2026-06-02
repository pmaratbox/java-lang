import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringJoiner;

public class Deduplicate {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 2, 3, 1);
        LinkedHashSet<Integer> unique = new LinkedHashSet<>(nums);
        StringJoiner out = new StringJoiner(" ");
        for (int x : unique) out.add(String.valueOf(x));
        System.out.println(out);
    }
}
