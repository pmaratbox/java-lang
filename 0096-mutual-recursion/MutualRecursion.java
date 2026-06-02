public class MutualRecursion {
    static boolean isEven(int n) {
        if (n == 0) return true;
        return isOdd(n - 1);
    }

    static boolean isOdd(int n) {
        if (n == 0) return false;
        return isEven(n - 1);
    }

    public static void main(String[] args) {
        for (int n : new int[]{4, 3}) {
            System.out.println(isEven(n) ? "even" : "odd");
        }
    }
}
