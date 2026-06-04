import java.util.ArrayList;
import java.util.List;

public class Parse {
    public static void main(String[] args) {
        String[] rows = {"alice,30", "bob,25"};
        List<String> pairs = new ArrayList<>();
        for (String row : rows) {
            String[] parts = row.split(",");
            pairs.add(parts[0] + "=" + parts[1]);
        }
        System.out.println(String.join(" ", pairs));
    }
}
