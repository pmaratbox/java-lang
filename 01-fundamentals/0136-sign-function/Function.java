static int sign(int x) {
    return Integer.compare(x, 0);
}

void main() {
    System.out.println(sign(-5) + " " + sign(0) + " " + sign(5));
}
