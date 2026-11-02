void main() {
    var width = 10;
    var pct = 0.4;
    var filled = (int) Math.round(width * pct);
    var sb = new StringBuilder("[");
    sb.append("#".repeat(filled));
    sb.append("-".repeat(width - filled));
    sb.append("]");
    IO.println(sb);
}
