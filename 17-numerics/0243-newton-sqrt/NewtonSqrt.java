public class NewtonSqrt {
    public static void main(String[] args) {
        double x = 2.0;
        for (int i = 0; i < 20; i++) {
            x = x - (x * x - 2) / (2 * x);
        }
        System.out.printf("%.4f%n", x);
    }
}
