public class CountingSort {
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 3, 1};
        int max = 0;
        for (int v : a) if (v > max) max = v;
        int[] counts = new int[max + 1];
        for (int v : a) counts[v]++;
        StringBuilder sb = new StringBuilder();
        for (int v = 0; v <= max; v++) {
            for (int c = 0; c < counts[v]; c++) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(v);
            }
        }
        System.out.println(sb);
    }
}
