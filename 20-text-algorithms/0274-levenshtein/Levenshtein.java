void main() {
    String a = "kitten", b = "sitting";
    var dp = new int[a.length() + 1][b.length() + 1];
    for (var i = 0; i <= a.length(); i++) dp[i][0] = i;
    for (var j = 0; j <= b.length(); j++) dp[0][j] = j;
    for (var i = 1; i <= a.length(); i++) {
        for (var j = 1; j <= b.length(); j++) {
            var cost = a.charAt(i - 1) == b.charAt(j - 1) ? 0 : 1;
            dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1),
                    dp[i - 1][j - 1] + cost);
        }
    }
    IO.println(dp[a.length()][b.length()]);
}
