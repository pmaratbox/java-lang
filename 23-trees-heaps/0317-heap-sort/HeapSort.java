import java.util.StringJoiner;

public class HeapSort {
    static void siftDown(int[] a, int i, int n) {
        while (true) {
            int largest = i, l = 2 * i + 1, r = 2 * i + 2;
            if (l < n && a[l] > a[largest]) largest = l;
            if (r < n && a[r] > a[largest]) largest = r;
            if (largest == i) return;
            int t = a[i]; a[i] = a[largest]; a[largest] = t;
            i = largest;
        }
    }

    static void heapSort(int[] a) {
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--) siftDown(a, i, n);
        for (int end = n - 1; end > 0; end--) {
            int t = a[0]; a[0] = a[end]; a[end] = t;
            siftDown(a, 0, end);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 8, 1, 4};
        heapSort(a);
        StringJoiner sj = new StringJoiner(" ");
        for (int v : a) sj.add(String.valueOf(v));
        System.out.println(sj);
    }
}
