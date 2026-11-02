static int gcd(int a, int b) {
    while (b != 0) {
        var t = b;
        b = a % b;
        a = t;
    }
    return a;
}

void main() {
    int a = 4, b = 6;
    IO.println(a / gcd(a, b) * b);
}
