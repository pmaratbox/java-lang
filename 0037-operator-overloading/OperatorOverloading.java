public class OperatorOverloading {
    record Point(int x, int y) {
        Point add(Point other) {
            return new Point(x + other.x, y + other.y);
        }
    }

    public static void main(String[] args) {
        Point p = new Point(1, 2).add(new Point(3, 4));
        System.out.println("(" + p.x() + ", " + p.y() + ")");
    }
}
