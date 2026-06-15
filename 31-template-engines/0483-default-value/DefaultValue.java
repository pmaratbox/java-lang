//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;

public class DefaultValue {
  public static void main(String[] args) throws Exception {
    Configuration cfg = new Configuration(Configuration.VERSION_2_3_33);
    String src = "${name!\"anonymous\"}";
    Template t = new Template("x", new StringReader(src), cfg);
    Map<String, Object> data = new HashMap<>();
    StringWriter out = new StringWriter();
    t.process(data, out);
    System.out.print(out.toString());
    System.out.println();
  }
}