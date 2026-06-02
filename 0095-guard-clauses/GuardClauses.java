public class GuardClauses {
    static String classify(int n) {
        if (n < 0) return "negative";
        if (n == 0) return "zero";
        return "positive";
    }

    public static void main(String[] args) {
        for (int n : new int[]{-1, 0, 5}) {
            System.out.println(classify(n));
        }
    }
}
