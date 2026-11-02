record MinMax(int lo, int hi) {}

static MinMax minMax(int a, int b) {
    return a < b ? new MinMax(a, b) : new MinMax(b, a);
}

void main() {
    var r = minMax(3, 7);
    IO.println("min: " + r.lo());
    IO.println("max: " + r.hi());
}
