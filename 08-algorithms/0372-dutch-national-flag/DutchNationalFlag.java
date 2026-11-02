void main() {
    int[] a = {2, 0, 2, 1, 1, 0};
    int low = 0, mid = 0, high = a.length - 1;
    while (mid <= high) {
        if (a[mid] == 0) {
            var t = a[low]; a[low] = a[mid]; a[mid] = t;
            low++;
            mid++;
        } else if (a[mid] == 1) {
            mid++;
        } else {
            var t = a[mid]; a[mid] = a[high]; a[high] = t;
            high--;
        }
    }
    var sb = new StringBuilder();
    for (var i = 0; i < a.length; i++) {
        if (i > 0) sb.append(' ');
        sb.append(a[i]);
    }
    IO.println(sb);
}
