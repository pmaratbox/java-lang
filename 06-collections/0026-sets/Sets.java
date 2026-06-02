import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>(List.of(1, 2, 2, 3));
        System.out.println("size: " + nums.size());
        System.out.println("has 2: " + (nums.contains(2) ? "yes" : "no"));
        System.out.println("has 5: " + (nums.contains(5) ? "yes" : "no"));
    }
}
