import java.util.List;
import java.util.StringJoiner;

public class InterleaveLists {
    public static void main(String[] args) {
        List<Integer> a = List.of(1, 3, 5);
        List<Integer> b = List.of(2, 4, 6);
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < a.size(); i++) {
            sj.add(a.get(i).toString());
            sj.add(b.get(i).toString());
        }
        System.out.println(sj);
    }
}
