static int gcd(int a, int b) {
    while (b != 0) {
        var t = b;
        b = a % b;
        a = t;
    }
    return a;
}

void main() {
    System.out.println(gcd(48, 36));
}
