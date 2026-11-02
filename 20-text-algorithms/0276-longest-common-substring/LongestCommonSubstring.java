void main() {
    String a = "abcde", b = "xbcdy";
    var dp = new int[a.length() + 1][b.length() + 1];
    int best = 0, end = 0;
    for (var i = 1; i <= a.length(); i++) {
        for (var j = 1; j <= b.length(); j++) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                dp[i][j] = dp[i - 1][j - 1] + 1;
                if (dp[i][j] > best) { best = dp[i][j]; end = i; }
            }
        }
    }
    IO.println(a.substring(end - best, end));
}
