public class RunLength {
    public static void main(String[] args) {
        String text = "aaabbc";
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            char ch = text.charAt(i);
            int count = 0;
            while (i < text.length() && text.charAt(i) == ch) {
                count++;
                i++;
            }
            result.append(ch).append(count);
        }
        System.out.println(result);
    }
}
