import java.util.List;

public class RecursiveSum {
    static int sum(List<Integer> xs) {
        if (xs.isEmpty()) return 0;
        return xs.get(0) + sum(xs.subList(1, xs.size()));
    }

    public static void main(String[] args) {
        System.out.println(sum(List.of(1, 2, 3, 4)));
    }
}
