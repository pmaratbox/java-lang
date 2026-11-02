static boolean isPrime(int n) {
    if (n < 2) return false;
    for (var i = 2; (long) i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

void main() {
    IO.println((isPrime(7) ? "yes" : "no") + " " + (isPrime(9) ? "yes" : "no"));
}
