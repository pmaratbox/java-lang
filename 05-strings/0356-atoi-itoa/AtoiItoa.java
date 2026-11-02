static int atoi(String s) {
    var i = 0;
    var neg = false;
    if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
        neg = s.charAt(i) == '-';
        i++;
    }
    var n = 0;
    for (; i < s.length(); i++) {
        n = n * 10 + (s.charAt(i) - '0');
    }
    return neg ? -n : n;
}

static String itoa(int n) {
    if (n == 0) return "0";
    var neg = n < 0;
    var v = Math.abs((long) n);
    var sb = new StringBuilder();
    while (v > 0) {
        sb.append((char) ('0' + (int) (v % 10)));
        v /= 10;
    }
    if (neg) sb.append('-');
    return sb.reverse().toString();
}

void main() {
    var parsed = atoi("-42");
    var formatted = itoa(parsed);
    IO.println(parsed + " " + formatted);
}
