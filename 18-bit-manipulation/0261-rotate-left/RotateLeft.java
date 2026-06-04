public class RotateLeft {
    static int rol8(int x, int n) {
        return ((x << n) | (x >> (8 - n))) & 0xff;
    }

    public static void main(String[] args) {
        System.out.println(rol8(1, 1) + " " + rol8(128, 1));
    }
}
