//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;

public class Loop {
  public static void main(String[] a) throws Exception {
    Configuration cfg = new Configuration(Configuration.VERSION_2_3_33);
    String src = "<#list nums as n>${n}<#sep>\n</#sep></#list>";
    Template t = new Template("loop", new StringReader(src), cfg);
    Map<String,Object> m = new HashMap<>();
    m.put("nums", Arrays.asList(1, 2, 3));
    StringWriter w = new StringWriter();
    t.process(m, w);
    System.out.println(w.toString());
  }
}
