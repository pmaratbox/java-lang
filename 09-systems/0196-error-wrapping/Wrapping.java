void main() {
    Throwable inner = new RuntimeException("inner");
    Throwable outer = new RuntimeException("outer", inner);
    System.out.println(outer.getMessage() + ": " + outer.getCause().getMessage());
}
