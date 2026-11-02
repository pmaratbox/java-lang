void main() {
    try {
        throw new RuntimeException("boom");
    } catch (RuntimeException e) {
        IO.println("caught");
    } finally {
        IO.println("cleanup");
    }
}
