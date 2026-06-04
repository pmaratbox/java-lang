public class FractionAdd {
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        long n1 = 1, d1 = 2, n2 = 1, d2 = 3;
        long num = n1 * d2 + n2 * d1;
        long den = d1 * d2;
        long g = gcd(num, den);
        System.out.println((num / g) + "/" + (den / g));
    }
}
