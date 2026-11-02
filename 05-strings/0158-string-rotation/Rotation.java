void main() {
    var a = "abcd";
    var b = "cdab";
    var rotation = a.length() == b.length() && (a + a).contains(b);
    IO.println(rotation ? "yes" : "no");
}
