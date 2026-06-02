public class Palindrome {
    static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        for (String word : new String[]{"level", "hello"}) {
            System.out.println(word + ": " + (isPalindrome(word) ? "yes" : "no"));
        }
    }
}
