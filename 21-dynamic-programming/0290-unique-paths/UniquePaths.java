void main() {
    int m = 3, n = 3;
    var dp = new int[m][n];
    for (var i = 0; i < m; i++) {
        for (var j = 0; j < n; j++) {
            if (i == 0 || j == 0) dp[i][j] = 1;
            else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
    }
    IO.println(dp[m - 1][n - 1]);
}
