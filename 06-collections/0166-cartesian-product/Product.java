import java.util.List;
import java.util.ArrayList;

public class Product {
    public static void main(String[] args) {
        List<Integer> xs = List.of(1, 2);
        List<String> ys = List.of("a", "b");
        List<String> pairs = new ArrayList<>();
        for (int x : xs) {
            for (String y : ys) {
                pairs.add(x + y);
            }
        }
        System.out.println(String.join(" ", pairs));
    }
}
