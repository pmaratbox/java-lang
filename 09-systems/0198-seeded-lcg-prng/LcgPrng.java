public class LcgPrng {
    public static void main(String[] args) {
        int x = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            x = (5 * x + 3) % 16;
            if (sb.length() > 0) sb.append(' ');
            sb.append(x);
        }
        System.out.println(sb);
    }
}
