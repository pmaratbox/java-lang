public class GcdExtended {
    // returns {g, x, y} with a*x + b*y = g
    static long[] egcd(long a, long b) {
        if (b == 0) return new long[]{a, 1, 0};
        long[] r = egcd(b, a % b);
        long g = r[0], x1 = r[1], y1 = r[2];
        return new long[]{g, y1, x1 - (a / b) * y1};
    }

    public static void main(String[] args) {
        long[] r = egcd(30, 12);
        System.out.println(r[0] + " " + r[1] + " " + r[2]);
    }
}
