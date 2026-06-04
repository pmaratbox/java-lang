public class BinaryEndian {
    public static void main(String[] args) {
        int value = 258;
        int high = (value >> 8) & 0xff;
        int low = value & 0xff;
        int decoded = high * 256 + low;
        System.out.println(high + " " + low + " " + decoded);
    }
}
