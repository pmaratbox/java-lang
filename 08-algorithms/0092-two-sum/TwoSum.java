import java.util.HashMap;
import java.util.Map;

void main() {
    int[] nums = {2, 7, 11, 15};
    var target = 9;
    Map<Integer, Integer> seen = new HashMap<>();
    for (var i = 0; i < nums.length; i++) {
        Integer j = seen.get(target - nums[i]);
        if (j != null) {
            System.out.println(j + " " + i);
            break;
        }
        seen.put(nums[i], i);
    }
}
