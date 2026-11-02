static String expand(String spec) {
    var start = spec.charAt(0);
    var end = spec.charAt(2);
    var sb = new StringBuilder();
    for (var c = start; c <= end; c++) {
        sb.append(c);
    }
    return sb.toString();
}

void main() {
    IO.println(expand("a-e"));
}
