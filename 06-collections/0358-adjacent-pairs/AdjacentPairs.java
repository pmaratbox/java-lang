import java.util.List;
import java.util.StringJoiner;

public class AdjacentPairs {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i + 1 < nums.size(); i++) {
            sj.add(nums.get(i) + "," + nums.get(i + 1));
        }
        System.out.println(sj);
    }
}
