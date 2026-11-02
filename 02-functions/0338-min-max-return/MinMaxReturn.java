record MinMax(int min, int max) {}

static MinMax minMax(int[] xs) {
    var min = xs[0];
    var max = xs[0];
    for (var x : xs) {
        if (x < min) min = x;
        if (x > max) max = x;
    }
    return new MinMax(min, max);
}

void main() {
    var r = minMax(new int[]{4, 1, 7});
    System.out.println(r.min() + " " + r.max());
}
