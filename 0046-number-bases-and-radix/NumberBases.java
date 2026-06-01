public class NumberBases {
    public static void main(String[] args) {
        int n = 255;
        System.out.println("hex: " + Integer.toHexString(n));
        System.out.println("oct: " + Integer.toOctalString(n));
        System.out.println("bin: " + Integer.toBinaryString(n));
    }
}
