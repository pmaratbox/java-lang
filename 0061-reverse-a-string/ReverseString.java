public class ReverseString {
    public static void main(String[] args) {
        String text = "abc";
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println(reversed);
    }
}
