void main() {
    int[] nums = {1, 5, 11, 5};
    var total = 0;
    for (var n : nums) total += n;
    if (total % 2 != 0) {
        System.out.println("no");
        return;
    }
    var target = total / 2;
    var dp = new boolean[target + 1];
    dp[0] = true;
    for (var n : nums) {
        for (var s = target; s >= n; s--) {
            if (dp[s - n]) dp[s] = true;
        }
    }
    System.out.println(dp[target] ? "yes" : "no");
}
