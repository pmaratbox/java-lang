void main() {
    boolean[][] rows = {{true, true}, {true, false}, {false, true}, {false, false}};
    for (var r : rows) {
        boolean a = r[0], b = r[1];
        IO.println(a + " " + b + " " + (a && b) + " " + (a || b) + " " + (a ^ b));
    }
}
