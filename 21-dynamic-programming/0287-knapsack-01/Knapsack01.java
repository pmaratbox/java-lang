public class Knapsack01 {
    public static void main(String[] args) {
        int[] w = {2, 3, 4};
        int[] v = {3, 4, 5};
        int cap = 5;
        int[] dp = new int[cap + 1];
        for (int i = 0; i < w.length; i++) {
            for (int c = cap; c >= w[i]; c--) {
                dp[c] = Math.max(dp[c], dp[c - w[i]] + v[i]);
            }
        }
        System.out.println(dp[cap]);
    }
}
