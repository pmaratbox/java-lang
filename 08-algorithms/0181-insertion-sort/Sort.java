void main() {
    int[] a = {5, 1, 4, 2, 8};
    for (var i = 1; i < a.length; i++) {
        var key = a[i];
        var j = i - 1;
        while (j >= 0 && a[j] > key) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = key;
    }
    var sb = new StringBuilder();
    for (var i = 0; i < a.length; i++) {
        if (i > 0) sb.append(' ');
        sb.append(a[i]);
    }
    System.out.println(sb);
}
