import java.util.StringJoiner;

static void siftDown(int[] a, int i, int n) {
    while (true) {
        int largest = i, l = 2 * i + 1, r = 2 * i + 2;
        if (l < n && a[l] > a[largest]) largest = l;
        if (r < n && a[r] > a[largest]) largest = r;
        if (largest == i) return;
        var t = a[i]; a[i] = a[largest]; a[largest] = t;
        i = largest;
    }
}

static void heapSort(int[] a) {
    var n = a.length;
    for (var i = n / 2 - 1; i >= 0; i--) siftDown(a, i, n);
    for (var end = n - 1; end > 0; end--) {
        var t = a[0]; a[0] = a[end]; a[end] = t;
        siftDown(a, 0, end);
    }
}

void main() {
    int[] a = {5, 3, 8, 1, 4};
    heapSort(a);
    var sj = new StringJoiner(" ");
    for (var v : a) sj.add(String.valueOf(v));
    IO.println(sj);
}
