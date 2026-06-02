public class Destructuring {
    record Pair(int x, int y) {}

    public static void main(String[] args) {
        int a = 1, b = 2;
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a + " " + b);

        Pair pair = new Pair(3, 4);
        if (pair instanceof Pair(int x, int y)) {
            System.out.println(x + " " + y);
        }
    }
}
