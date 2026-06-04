public class PartitionEqualSubset {
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        int total = 0;
        for (int n : nums) total += n;
        if (total % 2 != 0) {
            System.out.println("no");
            return;
        }
        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int n : nums) {
            for (int s = target; s >= n; s--) {
                if (dp[s - n]) dp[s] = true;
            }
        }
        System.out.println(dp[target] ? "yes" : "no");
    }
}
