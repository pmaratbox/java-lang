static long factorial(long n) {
    if (n <= 1) {
        return 1;
    }
    return n * factorial(n - 1);
}

void main() {
    IO.println("factorial(5) = " + factorial(5));
}
