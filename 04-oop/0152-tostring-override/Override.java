static class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

void main() {
    var p = new Point(1, 2);
    IO.println(p);
}
