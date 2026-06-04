public class Powerset {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int n = a.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    if (sb.length() > 0) sb.append(' ');
                    sb.append(a[i]);
                }
            }
            System.out.println(sb.length() == 0 ? "{}" : sb.toString());
        }
    }
}
