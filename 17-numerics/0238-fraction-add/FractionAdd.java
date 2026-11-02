static long gcd(long a, long b) {
    return b == 0 ? a : gcd(b, a % b);
}

void main() {
    long n1 = 1, d1 = 2, n2 = 1, d2 = 3;
    var num = n1 * d2 + n2 * d1;
    var den = d1 * d2;
    var g = gcd(num, den);
    IO.println((num / g) + "/" + (den / g));
}
