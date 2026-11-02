record Point(int x, int y) {
    @Override
    public String toString() {
        return "Point(x=" + x + ", y=" + y + ")";
    }
}

void main() {
    var p = new Point(1, 2);
    System.out.println(p);
}
