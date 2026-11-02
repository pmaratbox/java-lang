void main() {
    String[] strs = {"flower", "flow", "flight"};
    var prefix = strs[0];
    for (var s : strs) {
        var i = 0;
        var max = Math.min(prefix.length(), s.length());
        while (i < max && prefix.charAt(i) == s.charAt(i)) {
            i++;
        }
        prefix = prefix.substring(0, i);
    }
    IO.println(prefix);
}
