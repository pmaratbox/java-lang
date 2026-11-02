static String rot13(String s) {
    var sb = new StringBuilder();
    for (var c : s.toCharArray()) {
        if (c >= 'a' && c <= 'z') {
            sb.append((char) ('a' + (c - 'a' + 13) % 26));
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ('A' + (c - 'A' + 13) % 26));
        } else {
            sb.append(c);
        }
    }
    return sb.toString();
}

void main() {
    var once = rot13("hello");
    var twice = rot13(once);
    System.out.println(once + " " + twice);
}
