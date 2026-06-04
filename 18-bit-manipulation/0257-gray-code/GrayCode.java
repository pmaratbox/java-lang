public class GrayCode {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int n = 0; n < 4; n++) {
            if (n > 0) sb.append(' ');
            sb.append(n ^ (n >> 1));
        }
        System.out.println(sb);
    }
}
