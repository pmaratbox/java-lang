public class Year {
    static boolean isLeap(int y) {
        return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(
            (isLeap(2000) ? "yes" : "no") + " " +
            (isLeap(1900) ? "yes" : "no") + " " +
            (isLeap(2024) ? "yes" : "no"));
    }
}
