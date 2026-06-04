public class Lcm {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println(a / gcd(a, b) * b);
    }
}
