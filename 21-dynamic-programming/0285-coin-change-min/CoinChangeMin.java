void main() {
    int[] coins = {1, 2, 5};
    var amount = 11;
    var dp = new int[amount + 1];
    java.util.Arrays.fill(dp, amount + 1);
    dp[0] = 0;
    for (var a = 1; a <= amount; a++) {
        for (var c : coins) {
            if (c <= a) dp[a] = Math.min(dp[a], dp[a - c] + 1);
        }
    }
    System.out.println(dp[amount]);
}
