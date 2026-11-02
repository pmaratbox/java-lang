import java.util.HashSet;
import java.util.List;
import java.util.Set;

void main() {
    Set<Integer> nums = new HashSet<>(List.of(1, 2, 2, 3));
    IO.println("size: " + nums.size());
    IO.println("has 2: " + (nums.contains(2) ? "yes" : "no"));
    IO.println("has 5: " + (nums.contains(5) ? "yes" : "no"));
}
