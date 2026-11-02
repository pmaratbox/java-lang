static <T extends Comparable<T>> T largest(T a, T b) {
    return a.compareTo(b) > 0 ? a : b;
}

void main() {
    IO.println(largest(3, 9));
    IO.println(largest("apple", "pear"));
}
