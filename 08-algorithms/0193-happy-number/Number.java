import java.util.HashSet;
import java.util.Set;

static int squareDigits(int n) {
    var sum = 0;
    while (n > 0) {
        var d = n % 10;
        sum += d * d;
        n /= 10;
    }
    return sum;
}

void main() {
    var n = 19;
    Set<Integer> seen = new HashSet<>();
    while (n != 1 && !seen.contains(n)) {
        seen.add(n);
        n = squareDigits(n);
    }
    System.out.println(n == 1 ? "yes" : "no");
}
