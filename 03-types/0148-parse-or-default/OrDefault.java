public class OrDefault {
    static int parseOrDefault(String s, int fallback) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return fallback;
        }
    }

    public static void main(String[] args) {
        int a = parseOrDefault("42", 0);
        int b = parseOrDefault("x", 0);
        System.out.println(a + " " + b);
    }
}
