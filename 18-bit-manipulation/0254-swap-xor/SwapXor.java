public class SwapXor {
    public static void main(String[] args) {
        int a = 3, b = 5;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a + " " + b);
    }
}
