static long modpow(long base, long exp, long mod) {
    var result = 1 % mod;
    base %= mod;
    while (exp > 0) {
        if ((exp & 1) == 1) result = result * base % mod;
        base = base * base % mod;
        exp >>= 1;
    }
    return result;
}

void main() {
    IO.println(modpow(3, 13, 7));
}
