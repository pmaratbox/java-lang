import java.util.StringJoiner;

public class ScanProduct {
    public static void main(String[] args) {
        int[] xs = {1, 2, 3, 4};
        StringJoiner sj = new StringJoiner(" ");
        int acc = 1;
        for (int x : xs) {
            acc *= x;
            sj.add(String.valueOf(acc));
        }
        System.out.println(sj.toString());
    }
}
