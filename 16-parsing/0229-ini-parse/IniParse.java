import java.util.ArrayList;
import java.util.List;

public class IniParse {
    public static void main(String[] args) {
        String ini = "[s]\nk=v";
        List<String> entries = new ArrayList<>();
        String section = "";
        for (String line : ini.split("\n")) {
            line = line.trim();
            if (line.isEmpty()) continue;
            if (line.startsWith("[") && line.endsWith("]")) {
                section = line.substring(1, line.length() - 1);
            } else {
                int eq = line.indexOf('=');
                String key = line.substring(0, eq);
                String val = line.substring(eq + 1);
                entries.add(section + "." + key + "=" + val);
            }
        }
        for (String e : entries) System.out.println(e);
    }
}
