static int partition(int[] a, int lo, int hi) {
    var pivot = a[hi];
    var i = lo;
    for (var j = lo; j < hi; j++) {
        if (a[j] < pivot) {
            var t = a[i]; a[i] = a[j]; a[j] = t;
            i++;
        }
    }
    var t = a[i]; a[i] = a[hi]; a[hi] = t;
    return i;
}

static int select(int[] a, int lo, int hi, int k) {
    while (lo < hi) {
        var p = partition(a, lo, hi);
        if (p == k) return a[p];
        else if (p < k) lo = p + 1;
        else hi = p - 1;
    }
    return a[lo];
}

void main() {
    int[] a = {7, 10, 4, 3, 20, 15};
    IO.println(select(a, 0, a.length - 1, 2));
}
