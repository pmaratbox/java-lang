void main() {
    int[] w = {2, 3, 4};
    int[] v = {3, 4, 5};
    var cap = 5;
    var dp = new int[cap + 1];
    for (var i = 0; i < w.length; i++) {
        for (var c = cap; c >= w[i]; c--) {
            dp[c] = Math.max(dp[c], dp[c - w[i]] + v[i]);
        }
    }
    IO.println(dp[cap]);
}
