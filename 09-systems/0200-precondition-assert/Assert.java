static void check(int arg) {
    if (arg <= 0) {
        throw new IllegalArgumentException("must be positive");
    }
    IO.println("ok");
}

void main() {
    check(5);
    try {
        check(-1);
    } catch (IllegalArgumentException e) {
        IO.println("error: " + e.getMessage());
    }
}
