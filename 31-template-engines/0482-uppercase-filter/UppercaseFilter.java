//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;
public class UppercaseFilter {
  public static void main(String[] a) throws Exception {
    Configuration cfg = new Configuration(Configuration.VERSION_2_3_33);
    Template t = new Template("x", new StringReader("${name?upper_case}"), cfg);
    Map<String,Object> m = new HashMap<>(); m.put("name", "alice");
    StringWriter w = new StringWriter(); t.process(m, w);
    System.out.println(w.toString());
  }
}
