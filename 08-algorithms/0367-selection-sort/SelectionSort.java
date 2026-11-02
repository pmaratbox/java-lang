void main() {
    int[] a = {5, 1, 4, 2};
    for (var i = 0; i < a.length - 1; i++) {
        var min = i;
        for (var j = i + 1; j < a.length; j++) {
            if (a[j] < a[min]) min = j;
        }
        var t = a[i];
        a[i] = a[min];
        a[min] = t;
    }
    var sb = new StringBuilder();
    for (var i = 0; i < a.length; i++) {
        if (i > 0) sb.append(' ');
        sb.append(a[i]);
    }
    System.out.println(sb);
}
