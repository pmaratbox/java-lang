import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

void main() {
    List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    Collections.rotate(nums, -2);
    var out = new StringJoiner(" ");
    for (int x : nums) out.add(String.valueOf(x));
    IO.println(out);
}
