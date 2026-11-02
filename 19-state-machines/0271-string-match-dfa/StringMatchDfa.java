void main() {
    var pattern = "ab";
    var text = "aab";
    var state = 0;
    var matchIndex = -1;
    for (var i = 0; i < text.length(); i++) {
        var ch = text.charAt(i);
        if (state < pattern.length() && ch == pattern.charAt(state)) {
            state++;
        } else if (ch == pattern.charAt(0)) {
            state = 1;
        } else {
            state = 0;
        }
        if (state == pattern.length()) {
            matchIndex = i - pattern.length() + 1;
            break;
        }
    }
    IO.println(matchIndex);
}
