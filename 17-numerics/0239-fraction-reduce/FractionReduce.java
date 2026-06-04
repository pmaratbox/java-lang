public class FractionReduce {
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        long num = 6, den = 8;
        long g = gcd(num, den);
        System.out.println((num / g) + "/" + (den / g));
    }
}
