record Point(int x, int y) {
    Point withX(int newX) {
        return new Point(newX, y);
    }
}

void main() {
    var p1 = new Point(1, 2);
    var p2 = p1.withX(9);
    System.out.println("original: (" + p1.x() + ", " + p1.y() + ")");
    System.out.println("updated: (" + p2.x() + ", " + p2.y() + ")");
}
