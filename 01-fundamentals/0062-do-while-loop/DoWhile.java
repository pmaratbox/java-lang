import java.util.StringJoiner;

public class DoWhile {
    public static void main(String[] args) {
        StringJoiner out = new StringJoiner(" ");
        int i = 1;
        do {
            out.add(String.valueOf(i));
            i++;
        } while (i <= 3);
        System.out.println(out);
    }
}
