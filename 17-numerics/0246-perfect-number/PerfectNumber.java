public class PerfectNumber {
    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        String a = isPerfect(6) ? "yes" : "no";
        String b = isPerfect(8) ? "yes" : "no";
        System.out.println(a + " " + b);
    }
}
