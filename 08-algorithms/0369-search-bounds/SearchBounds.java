static int lowerBound(int[] a, int key) {
    int lo = 0, hi = a.length;
    while (lo < hi) {
        var mid = (lo + hi) >>> 1;
        if (a[mid] < key) lo = mid + 1;
        else hi = mid;
    }
    return lo;
}

static int upperBound(int[] a, int key) {
    int lo = 0, hi = a.length;
    while (lo < hi) {
        var mid = (lo + hi) >>> 1;
        if (a[mid] <= key) lo = mid + 1;
        else hi = mid;
    }
    return lo;
}

void main() {
    int[] a = {1, 3, 5, 5, 7};
    System.out.println(lowerBound(a, 5) + " " + upperBound(a, 5));
}
