public class SetBits {
    public static void main(String[] args) {
        int n = 13;
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        System.out.println(count);
    }
}
