import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Collections.rotate(nums, -2);
        StringJoiner out = new StringJoiner(" ");
        for (int x : nums) out.add(String.valueOf(x));
        System.out.println(out);
    }
}
