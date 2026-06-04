public class StringMatchDfa {
    public static void main(String[] args) {
        String pattern = "ab";
        String text = "aab";
        int state = 0;
        int matchIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (state < pattern.length() && ch == pattern.charAt(state)) {
                state++;
            } else if (ch == pattern.charAt(0)) {
                state = 1;
            } else {
                state = 0;
            }
            if (state == pattern.length()) {
                matchIndex = i - pattern.length() + 1;
                break;
            }
        }
        System.out.println(matchIndex);
    }
}
