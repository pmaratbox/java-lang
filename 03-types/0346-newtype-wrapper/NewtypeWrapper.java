record UserId(int value) {
    @Override public String toString() { return "user-" + value; }
}
record ProductId(int value) {
    @Override public String toString() { return "prod-" + value; }
}

void main() {
    var u = new UserId(1);
    var p = new ProductId(2);
    System.out.println(u + " " + p);
}
