public class FactorialIterative {
    public static void main(String[] args) {
        long result = 1;
        for (int i = 2; i <= 5; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
