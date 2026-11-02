import java.util.Arrays;
import java.util.StringJoiner;

void main() {
    var n = 10;
    var isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;
    for (var i = 2; i * i <= n; i++) {
        if (isPrime[i]) {
            for (var j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
    }

    var out = new StringJoiner(" ");
    for (var i = 2; i <= n; i++) {
        if (isPrime[i]) out.add(String.valueOf(i));
    }
    System.out.println(out);
}
