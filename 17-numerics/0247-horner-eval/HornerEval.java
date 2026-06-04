public class HornerEval {
    public static void main(String[] args) {
        // coefficients of 2x^2 + 3x + 1, highest degree first
        int[] coeffs = {2, 3, 1};
        int x = 2;
        int result = 0;
        for (int c : coeffs) {
            result = result * x + c;
        }
        System.out.println(result);
    }
}
