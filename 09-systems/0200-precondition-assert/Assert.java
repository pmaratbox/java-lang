public class Assert {
    static void check(int arg) {
        if (arg <= 0) {
            throw new IllegalArgumentException("must be positive");
        }
        System.out.println("ok");
    }

    public static void main(String[] args) {
        check(5);
        try {
            check(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
