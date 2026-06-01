public class Records {
    record Point(int x, int y) {}

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        System.out.println("point: (" + p1.x() + ", " + p1.y() + ")");
        System.out.println("equal: " + (p1.equals(p2) ? "yes" : "no"));
    }
}
