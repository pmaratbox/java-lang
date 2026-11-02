void main() {
    int[] a = {3, 1, 2, 3, 1};
    var max = 0;
    for (var v : a) if (v > max) max = v;
    var counts = new int[max + 1];
    for (var v : a) counts[v]++;
    var sb = new StringBuilder();
    for (var v = 0; v <= max; v++) {
        for (var c = 0; c < counts[v]; c++) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(v);
        }
    }
    IO.println(sb);
}
