public class MinMaxReturn {
    record MinMax(int min, int max) {}

    static MinMax minMax(int[] xs) {
        int min = xs[0];
        int max = xs[0];
        for (int x : xs) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        return new MinMax(min, max);
    }

    public static void main(String[] args) {
        MinMax r = minMax(new int[]{4, 1, 7});
        System.out.println(r.min() + " " + r.max());
    }
}
