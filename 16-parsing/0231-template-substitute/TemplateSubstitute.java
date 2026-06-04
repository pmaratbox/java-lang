import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemplateSubstitute {
    public static void main(String[] args) {
        Map<String, String> vars = new HashMap<>();
        vars.put("name", "Ada");
        System.out.println(render("hi {name}", vars));
    }

    static String render(String template, Map<String, String> vars) {
        Matcher m = Pattern.compile("\\{(\\w+)\\}").matcher(template);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            m.appendReplacement(sb, Matcher.quoteReplacement(vars.getOrDefault(m.group(1), "")));
        }
        m.appendTail(sb);
        return sb.toString();
    }
}
