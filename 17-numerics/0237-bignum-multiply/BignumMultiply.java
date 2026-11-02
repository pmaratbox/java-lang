static String multiply(String a, String b) {
    int n = a.length(), m = b.length();
    var res = new int[n + m];
    for (var i = n - 1; i >= 0; i--) {
        for (var j = m - 1; j >= 0; j--) {
            var prod = (a.charAt(i) - '0') * (b.charAt(j) - '0');
            var sum = prod + res[i + j + 1];
            res[i + j + 1] = sum % 10;
            res[i + j] += sum / 10;
        }
    }
    var sb = new StringBuilder();
    for (var d : res) {
        if (sb.length() == 0 && d == 0) continue;
        sb.append(d);
    }
    return sb.length() == 0 ? "0" : sb.toString();
}

void main() {
    IO.println(multiply("123", "456"));
}
