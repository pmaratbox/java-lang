public class Function {
    static int sign(int x) {
        return Integer.compare(x, 0);
    }

    public static void main(String[] args) {
        System.out.println(sign(-5) + " " + sign(0) + " " + sign(5));
    }
}
