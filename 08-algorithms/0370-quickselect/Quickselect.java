public class Quickselect {
    static int partition(int[] a, int lo, int hi) {
        int pivot = a[hi];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (a[j] < pivot) {
                int t = a[i]; a[i] = a[j]; a[j] = t;
                i++;
            }
        }
        int t = a[i]; a[i] = a[hi]; a[hi] = t;
        return i;
    }

    static int select(int[] a, int lo, int hi, int k) {
        while (lo < hi) {
            int p = partition(a, lo, hi);
            if (p == k) return a[p];
            else if (p < k) lo = p + 1;
            else hi = p - 1;
        }
        return a[lo];
    }

    public static void main(String[] args) {
        int[] a = {7, 10, 4, 3, 20, 15};
        System.out.println(select(a, 0, a.length - 1, 2));
    }
}
