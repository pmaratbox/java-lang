public class Repr {
    record Point(int x, int y) {
        @Override
        public String toString() {
            return "Point(x=" + x + ", y=" + y + ")";
        }
    }

    public static void main(String[] args) {
        Point p = new Point(1, 2);
        System.out.println(p);
    }
}
