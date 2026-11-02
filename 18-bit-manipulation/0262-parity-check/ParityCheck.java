static int parity(int n) {
    return Integer.bitCount(n) & 1;
}

void main() {
    System.out.println(parity(7) + " " + parity(5));
}
