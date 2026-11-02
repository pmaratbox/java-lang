void main() {
    var n = 5;
    int a = 1, b = 1;
    for (var i = 2; i <= n; i++) {
        var c = a + b;
        a = b;
        b = c;
    }
    IO.println(b);
}
