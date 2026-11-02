import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

static String join(List<Integer> xs) {
    var j = new StringJoiner(" ");
    for (int x : xs) j.add(String.valueOf(x));
    return j.toString();
}

void main() {
    int[] nums = {1, 2, 3, 4, 5, 6};
    List<Integer> evens = new ArrayList<>();
    List<Integer> odds = new ArrayList<>();
    for (var n : nums) {
        if (n % 2 == 0) evens.add(n);
        else odds.add(n);
    }
    System.out.println("evens: " + join(evens));
    System.out.println("odds: " + join(odds));
}
