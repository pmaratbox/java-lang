public class Assertions {
    static void check(boolean cond, String msg) {
        if (!cond) {
            throw new AssertionError(msg);
        }
    }

    public static void main(String[] args) {
        check(1 + 1 == 2, "1+1 should be 2");
        check("ab".length() == 2, "length of ab should be 2");
        check(Math.max(3, 7) == 7, "max(3,7) should be 7");
        System.out.println("all passed");
    }
}
