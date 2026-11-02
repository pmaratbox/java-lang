static String add(String a, String b) {
    var sb = new StringBuilder();
    int i = a.length() - 1, j = b.length() - 1, carry = 0;
    while (i >= 0 || j >= 0 || carry > 0) {
        var da = i >= 0 ? a.charAt(i--) - '0' : 0;
        var db = j >= 0 ? b.charAt(j--) - '0' : 0;
        var sum = da + db + carry;
        sb.append((char) ('0' + sum % 10));
        carry = sum / 10;
    }
    return sb.reverse().toString();
}

void main() {
    IO.println(add("999999999999", "1"));
}
