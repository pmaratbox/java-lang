static String word(int n) {
    return switch (n) {
        case 1 -> "one";
        case 2 -> "two";
        default -> "many";
    };
}

void main() {
    for (var n : new int[]{1, 2, 5}) {
        IO.println(n + ": " + word(n));
    }
}
