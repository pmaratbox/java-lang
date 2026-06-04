public class Permutations {
    static void permute(int[] a, int k) {
        if (k == a.length) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < a.length; i++) {
                if (i > 0) sb.append(' ');
                sb.append(a[i]);
            }
            System.out.println(sb);
            return;
        }
        for (int i = k; i < a.length; i++) {
            // keep lexicographic order by rotating a[i] into position k
            int v = a[i];
            for (int j = i; j > k; j--) a[j] = a[j - 1];
            a[k] = v;
            permute(a, k + 1);
            for (int j = k; j < i; j++) a[j] = a[j + 1];
            a[i] = v;
        }
    }

    public static void main(String[] args) {
        permute(new int[]{1, 2, 3}, 0);
    }
}
