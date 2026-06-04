public class CatalanNumber {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long c = 1;
        for (int n = 0; n < 5; n++) {
            if (n > 0) sb.append(' ');
            sb.append(c);
            c = c * 2 * (2 * n + 1) / (n + 2);
        }
        System.out.println(sb);
    }
}
