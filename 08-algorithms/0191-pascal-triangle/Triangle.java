public class Triangle {
    public static void main(String[] args) {
        int rows = 4;
        int[] row = {1};
        for (int r = 0; r < rows; r++) {
            int[] next = new int[r + 2];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= r; i++) {
                if (i > 0) sb.append(' ');
                sb.append(row[i]);
                next[i] += row[i];
                next[i + 1] += row[i];
            }
            System.out.println(sb);
            row = next;
        }
    }
}
