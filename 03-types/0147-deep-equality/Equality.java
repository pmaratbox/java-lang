public class Equality {
    record Pair(int a, int b) {}
    record Nested(Pair left, Pair right) {}

    public static void main(String[] args) {
        Nested x = new Nested(new Pair(1, 2), new Pair(3, 4));
        Nested y = new Nested(new Pair(1, 2), new Pair(3, 4));
        String result = x.equals(y) ? "yes" : "no";
        System.out.println("equal: " + result);
    }
}
