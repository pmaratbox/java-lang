void main() {
    int[] p = {10, 20, 30, 40};
    var n = p.length - 1;
    var dp = new int[n][n];
    for (var len = 2; len <= n; len++) {
        for (var i = 0; i + len - 1 < n; i++) {
            var j = i + len - 1;
            dp[i][j] = Integer.MAX_VALUE;
            for (var k = i; k < j; k++) {
                var cost = dp[i][k] + dp[k + 1][j] + p[i] * p[k + 1] * p[j + 1];
                dp[i][j] = Math.min(dp[i][j], cost);
            }
        }
    }
    System.out.println(dp[0][n - 1]);
}
