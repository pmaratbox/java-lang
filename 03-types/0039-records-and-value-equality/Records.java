record Point(int x, int y) {}

void main() {
    var p1 = new Point(1, 2);
    var p2 = new Point(1, 2);
    System.out.println("point: (" + p1.x() + ", " + p1.y() + ")");
    System.out.println("equal: " + (p1.equals(p2) ? "yes" : "no"));
}
