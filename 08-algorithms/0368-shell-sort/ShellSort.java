void main() {
    int[] a = {5, 2, 8, 1, 9, 3};
    for (var gap = a.length / 2; gap > 0; gap /= 2) {
        for (var i = gap; i < a.length; i++) {
            var tmp = a[i];
            var j = i;
            while (j >= gap && a[j - gap] > tmp) {
                a[j] = a[j - gap];
                j -= gap;
            }
            a[j] = tmp;
        }
    }
    var sb = new StringBuilder();
    for (var i = 0; i < a.length; i++) {
        if (i > 0) sb.append(' ');
        sb.append(a[i]);
    }
    IO.println(sb);
}
