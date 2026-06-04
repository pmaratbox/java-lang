public class ReverseBitsByte {
    public static void main(String[] args) {
        int x = 1;
        int r = 0;
        for (int i = 0; i < 8; i++) {
            r = (r << 1) | ((x >> i) & 1);
        }
        System.out.println(r);
    }
}
