static int moves(int n) {
    if (n == 0) return 0;
    return 2 * moves(n - 1) + 1;
}

void main() {
    IO.println(moves(3));
}
