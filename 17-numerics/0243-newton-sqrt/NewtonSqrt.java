void main() {
    var x = 2.0;
    for (var i = 0; i < 20; i++) {
        x = x - (x * x - 2) / (2 * x);
    }
    System.out.printf("%.4f%n", x);
}
