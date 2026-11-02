static int clamp(int x, int lo, int hi) {
    return Math.max(lo, Math.min(x, hi));
}

void main() {
    IO.println(clamp(15, 0, 10) + " " + clamp(-3, 0, 10));
}
