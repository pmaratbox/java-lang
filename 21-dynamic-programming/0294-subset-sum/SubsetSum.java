public class SubsetSum {
    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int target = 9;
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
