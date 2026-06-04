import java.util.ArrayList;
import java.util.List;

public class CsvQuotedParse {
    public static void main(String[] args) {
        List<String> fields = parse("a,\"b,c\",d");
        System.out.println(String.join("|", fields));
    }

    static List<String> parse(String row) {
        List<String> fields = new ArrayList<>();
        StringBuilder field = new StringBuilder();
        boolean inQuotes = false;
        for (int i = 0; i < row.length(); i++) {
            char c = row.charAt(i);
            if (c == '"') {
                inQuotes = !inQuotes;
            } else if (c == ',' && !inQuotes) {
                fields.add(field.toString());
                field.setLength(0);
            } else {
                field.append(c);
            }
        }
        fields.add(field.toString());
        return fields;
    }
}
