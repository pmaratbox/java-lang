public class ParityCheck {
    static int parity(int n) {
        return Integer.bitCount(n) & 1;
    }

    public static void main(String[] args) {
        System.out.println(parity(7) + " " + parity(5));
    }
}
