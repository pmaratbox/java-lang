public class PowerOfTwoCheck {
    static boolean isPow2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println((isPow2(16) ? "yes" : "no") + " " + (isPow2(18) ? "yes" : "no"));
    }
}
