void main() {
    int[] coins = {1, 2, 5};
    var amount = 5;
    var dp = new int[amount + 1];
    dp[0] = 1;
    for (var c : coins) {
        for (var a = c; a <= amount; a++) {
            dp[a] += dp[a - c];
        }
    }
    System.out.println(dp[amount]);
}
