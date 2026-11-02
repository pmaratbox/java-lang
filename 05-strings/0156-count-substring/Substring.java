void main() {
    var s = "ababab";
    var t = "ab";
    var count = 0;
    var i = 0;
    while ((i = s.indexOf(t, i)) != -1) {
        count++;
        i += t.length();
    }
    IO.println(count);
}
