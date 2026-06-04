public class Clamp {
    static int clamp(int x, int lo, int hi) {
        return Math.max(lo, Math.min(x, hi));
    }

    public static void main(String[] args) {
        System.out.println(clamp(15, 0, 10) + " " + clamp(-3, 0, 10));
    }
}
