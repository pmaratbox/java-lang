public class Tuples {
    record MinMax(int lo, int hi) {}

    static MinMax minMax(int a, int b) {
        return a < b ? new MinMax(a, b) : new MinMax(b, a);
    }

    public static void main(String[] args) {
        MinMax r = minMax(3, 7);
        System.out.println("min: " + r.lo());
        System.out.println("max: " + r.hi());
    }
}
