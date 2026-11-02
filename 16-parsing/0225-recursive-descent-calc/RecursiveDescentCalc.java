public class RecursiveDescentCalc {
    private final String src;
    private int pos;

    RecursiveDescentCalc(String src) {
        this.src = src;
    }

    static void main() {
        IO.println(new RecursiveDescentCalc("2+3*4").expr());
    }

    int expr() {
        var value = term();
        while (pos < src.length() && (peek() == '+' || peek() == '-')) {
            var op = src.charAt(pos++);
            var rhs = term();
            value = op == '+' ? value + rhs : value - rhs;
        }
        return value;
    }

    int term() {
        var value = factor();
        while (pos < src.length() && (peek() == '*' || peek() == '/')) {
            var op = src.charAt(pos++);
            var rhs = factor();
            value = op == '*' ? value * rhs : value / rhs;
        }
        return value;
    }

    int factor() {
        var start = pos;
        while (pos < src.length() && Character.isDigit(src.charAt(pos))) pos++;
        return Integer.parseInt(src.substring(start, pos));
    }

    char peek() {
        return src.charAt(pos);
    }
}
