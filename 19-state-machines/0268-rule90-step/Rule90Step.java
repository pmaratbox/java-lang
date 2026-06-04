public class Rule90Step {
    public static void main(String[] args) {
        int[] row = {0, 0, 1, 0, 0};
        int n = row.length;
        int[] next = new int[n];
        for (int i = 0; i < n; i++) {
            int left = (i - 1 >= 0) ? row[i - 1] : 0;
            int right = (i + 1 < n) ? row[i + 1] : 0;
            next[i] = left ^ right;
        }
        StringBuilder sb = new StringBuilder();
        for (int v : next) sb.append(v);
        System.out.println(sb.toString());
    }
}
