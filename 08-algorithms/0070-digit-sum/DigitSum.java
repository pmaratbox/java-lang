public class DigitSum {
    public static void main(String[] args) {
        int n = 1234;
        int total = 0;
        while (n > 0) {
            total += n % 10;
            n /= 10;
        }
        System.out.println(total);
    }
}
