void main() {
    var mask = 5;
    var sb = new StringBuilder();
    var sub = mask;
    while (true) {
        if (sb.length() > 0) sb.append(' ');
        sb.append(sub);
        if (sub == 0) break;
        sub = (sub - 1) & mask;
    }
    System.out.println(sb);
}
