//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;
public class ListLength {
  public static void main(String[] a) throws Exception {
    Configuration cfg = new Configuration(Configuration.VERSION_2_3_33);
    String src = "${items?size}";
    Template t = new Template("x", new StringReader(src), cfg);
    Map<String,Object> m = new HashMap<>();
    m.put("items", Arrays.asList(1, 2, 3));
    StringWriter w = new StringWriter();
    t.process(m, w);
    System.out.println(w.toString());
  }
}
