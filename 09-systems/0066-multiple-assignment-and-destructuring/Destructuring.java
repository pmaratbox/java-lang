record Pair(int x, int y) {}

void main() {
    int a = 1, b = 2;
    var tmp = a;
    a = b;
    b = tmp;
    System.out.println(a + " " + b);

    var pair = new Pair(3, 4);
    if (pair instanceof Pair(int x, int y)) {
        System.out.println(x + " " + y);
    }
}
