import java.util.HashSet;
import java.util.Set;

public class Number {
    static int squareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = squareDigits(n);
        }
        System.out.println(n == 1 ? "yes" : "no");
    }
}
