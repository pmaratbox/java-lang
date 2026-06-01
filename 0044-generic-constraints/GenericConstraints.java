public class GenericConstraints {
    static <T extends Comparable<T>> T largest(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(largest(3, 9));
        System.out.println(largest("apple", "pear"));
    }
}
