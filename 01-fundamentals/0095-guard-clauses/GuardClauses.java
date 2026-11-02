static String classify(int n) {
    if (n < 0) return "negative";
    if (n == 0) return "zero";
    return "positive";
}

void main() {
    for (var n : new int[]{-1, 0, 5}) {
        IO.println(classify(n));
    }
}
