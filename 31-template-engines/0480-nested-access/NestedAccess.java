//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;

public class NestedAccess {
  public static void main(String[] a) throws Exception {
    Configuration cfg = new Configuration(Configuration.VERSION_2_3_33);
    String src = "${user.name}";
    Template t = new Template("nested", new StringReader(src), cfg);
    Map<String,Object> user = new HashMap<>();
    user.put("name", "alice");
    Map<String,Object> m = new HashMap<>();
    m.put("user", user);
    StringWriter w = new StringWriter();
    t.process(m, w);
    System.out.println(w.toString());
  }
}
