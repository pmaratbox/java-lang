static long gcd(long a, long b) {
    return b == 0 ? a : gcd(b, a % b);
}

void main() {
    long num = 6, den = 8;
    var g = gcd(num, den);
    IO.println((num / g) + "/" + (den / g));
}
