import java.util.Arrays;
import java.util.StringJoiner;

public class Sieve {
    public static void main(String[] args) {
        int n = 10;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        StringJoiner out = new StringJoiner(" ");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) out.add(String.valueOf(i));
        }
        System.out.println(out);
    }
}
