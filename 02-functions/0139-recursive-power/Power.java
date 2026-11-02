static int power(int base, int exp) {
    if (exp == 0) return 1;
    return base * power(base, exp - 1);
}

void main() {
    System.out.println(power(2, 10));
}
