public class CoinChangeCount {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int c : coins) {
            for (int a = c; a <= amount; a++) {
                dp[a] += dp[a - c];
            }
        }
        System.out.println(dp[amount]);
    }
}
