public class LeftRight {
    public static void main(String[] args) {
        String s = "5";
        String left = String.format("%3s", s);
        String right = String.format("%-3s", s);
        System.out.println(left + "|" + right);
    }
}
