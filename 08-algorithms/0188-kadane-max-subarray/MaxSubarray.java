void main() {
    int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    var cur = a[0];
    var best = a[0];
    for (var i = 1; i < a.length; i++) {
        cur = Math.max(a[i], cur + a[i]);
        best = Math.max(best, cur);
    }
    System.out.println(best);
}
