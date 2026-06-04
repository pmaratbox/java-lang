public class RetryLogic {
    static int attempt = 0;

    static boolean operation() {
        attempt++;
        return attempt >= 3;
    }

    public static void main(String[] args) {
        int maxAttempts = 5;
        for (int i = 1; i <= maxAttempts; i++) {
            if (operation()) {
                System.out.println("ok after " + i);
                break;
            }
        }
    }
}
