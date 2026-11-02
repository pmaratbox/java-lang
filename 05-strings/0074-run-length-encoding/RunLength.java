void main() {
    var text = "aaabbc";
    var result = new StringBuilder();
    var i = 0;
    while (i < text.length()) {
        var ch = text.charAt(i);
        var count = 0;
        while (i < text.length() && text.charAt(i) == ch) {
            count++;
            i++;
        }
        result.append(ch).append(count);
    }
    System.out.println(result);
}
