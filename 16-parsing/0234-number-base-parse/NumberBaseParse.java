public class NumberBaseParse {
    public static void main(String[] args) {
        int hex = Integer.parseInt("ff", 16);
        int bin = Integer.parseInt("101", 2);
        System.out.println(hex + " " + bin);
    }
}
