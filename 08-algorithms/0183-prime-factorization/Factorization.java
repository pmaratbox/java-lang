public class Factorization {
    public static void main(String[] args) {
        int n = 60;
        StringBuilder sb = new StringBuilder();
        while (n % 2 == 0) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(2);
            n /= 2;
        }
        for (int f = 3; (long) f * f <= n; f += 2) {
            while (n % f == 0) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(f);
                n /= f;
            }
        }
        if (n > 1) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(n);
        }
        System.out.println(sb);
    }
}
