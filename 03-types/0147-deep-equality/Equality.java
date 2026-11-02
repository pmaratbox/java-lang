record Pair(int a, int b) {}
record Nested(Pair left, Pair right) {}

void main() {
    var x = new Nested(new Pair(1, 2), new Pair(3, 4));
    var y = new Nested(new Pair(1, 2), new Pair(3, 4));
    var result = x.equals(y) ? "yes" : "no";
    IO.println("equal: " + result);
}
