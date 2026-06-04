public class WcCounts {
    public static void main(String[] args) {
        String text = "a b\nc";
        int chars = text.length();
        int lines = (int) text.chars().filter(c -> c == '\n').count() + 1;
        String trimmed = text.trim();
        int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
        System.out.println(words + " " + lines + " " + chars);
    }
}
