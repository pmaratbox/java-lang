public class CatchFinally {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("boom");
        } catch (RuntimeException e) {
            System.out.println("caught");
        } finally {
            System.out.println("cleanup");
        }
    }
}
