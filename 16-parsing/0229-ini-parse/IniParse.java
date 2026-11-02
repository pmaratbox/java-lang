import java.util.ArrayList;
import java.util.List;

void main() {
    var ini = "[s]\nk=v";
    List<String> entries = new ArrayList<>();
    var section = "";
    for (var line : ini.split("\n")) {
        line = line.trim();
        if (line.isEmpty()) continue;
        if (line.startsWith("[") && line.endsWith("]")) {
            section = line.substring(1, line.length() - 1);
        } else {
            var eq = line.indexOf('=');
            var key = line.substring(0, eq);
            var val = line.substring(eq + 1);
            entries.add(section + "." + key + "=" + val);
        }
    }
    for (String e : entries) System.out.println(e);
}
