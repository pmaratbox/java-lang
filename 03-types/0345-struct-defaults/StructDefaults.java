public class StructDefaults {
    record Point(int x, int y) {
        static Point defaults() {
            return new Point(0, 0);
        }
        Point withX(int x) {
            return new Point(x, this.y);
        }
    }

    public static void main(String[] args) {
        Point a = Point.defaults();
        Point b = Point.defaults().withX(5);
        System.out.println(a.x() + " " + a.y());
        System.out.println(b.x() + " " + b.y());
    }
}
