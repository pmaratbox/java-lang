record Point(int x, int y) {
    static Point defaults() {
        return new Point(0, 0);
    }
    Point withX(int x) {
        return new Point(x, this.y);
    }
}

void main() {
    var a = Point.defaults();
    var b = Point.defaults().withX(5);
    System.out.println(a.x() + " " + a.y());
    System.out.println(b.x() + " " + b.y());
}
