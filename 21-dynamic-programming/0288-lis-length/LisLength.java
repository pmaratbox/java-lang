void main() {
    int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
    var dp = new int[nums.length];
    var best = 0;
    for (var i = 0; i < nums.length; i++) {
        dp[i] = 1;
        for (var j = 0; j < i; j++) {
            if (nums[j] < nums[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
        }
        best = Math.max(best, dp[i]);
    }
    IO.println(best);
}
