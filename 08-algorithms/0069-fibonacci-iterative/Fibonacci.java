import java.util.StringJoiner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        StringJoiner out = new StringJoiner(" ");
        for (int i = 0; i < 7; i++) {
            out.add(String.valueOf(a));
            int t = a + b;
            a = b;
            b = t;
        }
        System.out.println(out);
    }
}
