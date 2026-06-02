import java.util.StringJoiner;

public class PrefixSums {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] sums = new int[nums.length];
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            sums[i] = total;
        }

        StringJoiner out = new StringJoiner(" ");
        for (int x : sums) {
            out.add(String.valueOf(x));
        }
        System.out.println(out);
    }
}
