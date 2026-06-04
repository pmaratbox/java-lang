public class Tokenizer {
    public static void main(String[] args) {
        String src = "1 + 2";
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (Character.isDigit(c)) {
                append(out, "NUM");
            } else if (c == '+') {
                append(out, "PLUS");
            }
        }
        System.out.println(out.toString());
    }

    static void append(StringBuilder out, String tok) {
        if (out.length() > 0) out.append(' ');
        out.append(tok);
    }
}
