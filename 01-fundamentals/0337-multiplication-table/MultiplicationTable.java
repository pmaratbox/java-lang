public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= 3; j++) {
                if (j > 1) sb.append(' ');
                sb.append(i * j);
            }
            System.out.println(sb);
        }
    }
}
