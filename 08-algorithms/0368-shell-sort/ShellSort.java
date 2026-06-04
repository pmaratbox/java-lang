public class ShellSort {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 9, 3};
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                int tmp = a[i];
                int j = i;
                while (j >= gap && a[j - gap] > tmp) {
                    a[j] = a[j - gap];
                    j -= gap;
                }
                a[j] = tmp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i > 0) sb.append(' ');
            sb.append(a[i]);
        }
        System.out.println(sb);
    }
}
