static boolean isLeap(int y) {
    return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
}

void main() {
    IO.println(
        (isLeap(2000) ? "yes" : "no") + " " +
        (isLeap(1900) ? "yes" : "no") + " " +
        (isLeap(2024) ? "yes" : "no"));
}
