void main() {
    int[] a = {5, 1, 4, 2, 8};
    for (var i = 0; i < a.length - 1; i++) {
        for (var j = 0; j < a.length - 1 - i; j++) {
            if (a[j] > a[j + 1]) {
                var t = a[j];
                a[j] = a[j + 1];
                a[j + 1] = t;
            }
        }
    }
    var sb = new StringBuilder();
    for (var i = 0; i < a.length; i++) {
        if (i > 0) sb.append(' ');
        sb.append(a[i]);
    }
    System.out.println(sb);
}
