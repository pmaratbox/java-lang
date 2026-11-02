import java.util.ArrayList;
import java.util.List;

void main() {
    var fields = parse("a,\"b,c\",d");
    System.out.println(String.join("|", fields));
}

static List<String> parse(String row) {
    List<String> fields = new ArrayList<>();
    var field = new StringBuilder();
    var inQuotes = false;
    for (var i = 0; i < row.length(); i++) {
        var c = row.charAt(i);
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
