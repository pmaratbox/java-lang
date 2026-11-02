static int parseOrDefault(String s, int fallback) {
    try {
        return Integer.parseInt(s);
    } catch (NumberFormatException e) {
        return fallback;
    }
}

void main() {
    var a = parseOrDefault("42", 0);
    var b = parseOrDefault("x", 0);
    System.out.println(a + " " + b);
}
