void main() {
    var src = "1 + 2";
    var out = new StringBuilder();
    for (var i = 0; i < src.length(); i++) {
        var c = src.charAt(i);
        if (Character.isDigit(c)) {
            append(out, "NUM");
        } else if (c == '+') {
            append(out, "PLUS");
        }
    }
    IO.println(out.toString());
}

static void append(StringBuilder out, String tok) {
    if (out.length() > 0) out.append(' ');
    out.append(tok);
}
