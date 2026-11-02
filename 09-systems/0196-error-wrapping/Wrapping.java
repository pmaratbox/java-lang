void main() {
    Throwable inner = new RuntimeException("inner");
    Throwable outer = new RuntimeException("outer", inner);
    IO.println(outer.getMessage() + ": " + outer.getCause().getMessage());
}
