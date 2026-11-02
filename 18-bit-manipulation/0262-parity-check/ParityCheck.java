static int parity(int n) {
    return Integer.bitCount(n) & 1;
}

void main() {
    IO.println(parity(7) + " " + parity(5));
}
