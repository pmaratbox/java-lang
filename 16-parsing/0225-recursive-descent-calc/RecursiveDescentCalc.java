public class RecursiveDescentCalc {
    private final String src;
    private int pos;

    RecursiveDescentCalc(String src) {
        this.src = src;
    }

    public static void main(String[] args) {
        System.out.println(new RecursiveDescentCalc("2+3*4").expr());
    }

    int expr() {
        int value = term();
        while (pos < src.length() && (peek() == '+' || peek() == '-')) {
            char op = src.charAt(pos++);
            int rhs = term();
            value = op == '+' ? value + rhs : value - rhs;
        }
        return value;
    }

    int term() {
        int value = factor();
        while (pos < src.length() && (peek() == '*' || peek() == '/')) {
            char op = src.charAt(pos++);
            int rhs = factor();
            value = op == '*' ? value * rhs : value / rhs;
        }
        return value;
    }

    int factor() {
        int start = pos;
        while (pos < src.length() && Character.isDigit(src.charAt(pos))) pos++;
        return Integer.parseInt(src.substring(start, pos));
    }

    char peek() {
        return src.charAt(pos);
    }
}
