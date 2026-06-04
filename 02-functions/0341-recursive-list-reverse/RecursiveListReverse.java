import java.util.ArrayList;
import java.util.List;

public class RecursiveListReverse {
    static List<Integer> reverse(List<Integer> xs) {
        if (xs.isEmpty()) return new ArrayList<>();
        List<Integer> rest = reverse(xs.subList(1, xs.size()));
        rest.add(xs.get(0));
        return rest;
    }

    public static void main(String[] args) {
        List<Integer> r = reverse(List.of(1, 2, 3));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r.size(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(r.get(i));
        }
        System.out.println(sb);
    }
}
