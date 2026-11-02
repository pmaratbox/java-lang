static void permute(int[] a, int k) {
    if (k == a.length) {
        var sb = new StringBuilder();
        for (var i = 0; i < a.length; i++) {
            if (i > 0) sb.append(' ');
            sb.append(a[i]);
        }
        System.out.println(sb);
        return;
    }
    for (var i = k; i < a.length; i++) {
        // keep lexicographic order by rotating a[i] into position k
        var v = a[i];
        for (var j = i; j > k; j--) a[j] = a[j - 1];
        a[k] = v;
        permute(a, k + 1);
        for (var j = k; j < i; j++) a[j] = a[j + 1];
        a[i] = v;
    }
}

void main() {
    permute(new int[]{1, 2, 3}, 0);
}
