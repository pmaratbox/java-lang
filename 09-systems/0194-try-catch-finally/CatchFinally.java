void main() {
    try {
        throw new RuntimeException("boom");
    } catch (RuntimeException e) {
        System.out.println("caught");
    } finally {
        System.out.println("cleanup");
    }
}
