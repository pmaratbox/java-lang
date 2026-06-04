public class CallCounter {
    public static void main(String[] args) {
        int[] count = {0};
        Runnable wrapped = () -> count[0]++;
        for (int i = 0; i < 5; i++) {
            wrapped.run();
        }
        System.out.println("calls: " + count[0]);
    }
}
