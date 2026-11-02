void main() {
    int[] nums = {3, 34, 4, 12, 5, 2};
    var target = 9;
    var dp = new boolean[target + 1];
    dp[0] = true;
    for (var n : nums) {
        for (var s = target; s >= n; s--) {
            if (dp[s - n]) dp[s] = true;
        }
    }
    System.out.println(dp[target] ? "yes" : "no");
}
