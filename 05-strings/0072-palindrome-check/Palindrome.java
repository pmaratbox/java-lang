static boolean isPalindrome(String s) {
    return s.equals(new StringBuilder(s).reverse().toString());
}

void main() {
    for (var word : new String[]{"level", "hello"}) {
        System.out.println(word + ": " + (isPalindrome(word) ? "yes" : "no"));
    }
}
