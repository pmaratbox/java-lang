public class Prime {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println((isPrime(7) ? "yes" : "no") + " " + (isPrime(9) ? "yes" : "no"));
    }
}
