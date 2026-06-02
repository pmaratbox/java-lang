public class ErrorHandling {
    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("division by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("10 / 2 = " + divide(10, 2));

        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
