static long binom(int n, int k) {
    if (k > n - k) k = n - k;
    long result = 1;
    for (var i = 0; i < k; i++) {
        result = result * (n - i) / (i + 1);
    }
    return result;
}

void main() {
    System.out.println(binom(5, 2));
}
