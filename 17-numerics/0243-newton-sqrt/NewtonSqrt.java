void main() {
    var x = 2.0;
    for (var i = 0; i < 20; i++) {
        x = x - (x * x - 2) / (2 * x);
    }
    IO.println("%.4f".formatted(x));
}
