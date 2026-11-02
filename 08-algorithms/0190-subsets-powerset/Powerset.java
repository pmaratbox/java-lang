void main() {
    int[] a = {1, 2, 3};
    var n = a.length;
    for (var mask = 0; mask < (1 << n); mask++) {
        var sb = new StringBuilder();
        for (var i = 0; i < n; i++) {
            if ((mask & (1 << i)) != 0) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(a[i]);
            }
        }
        System.out.println(sb.length() == 0 ? "{}" : sb.toString());
    }
}
