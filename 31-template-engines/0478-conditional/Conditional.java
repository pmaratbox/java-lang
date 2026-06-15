//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;
public class Conditional {
  public static void main(String[] a) throws Exception {
    Configuration cfg = new Configuration(Configuration.VERSION_2_3_33);
    String src = "<#if logged_in>welcome<#else>guest</#if>";
    Template t = new Template("x", new StringReader(src), cfg);
    Map<String,Object> m = new HashMap<>();
    m.put("logged_in", true);
    StringWriter w = new StringWriter();
    t.process(m, w);
    System.out.println(w.toString());
  }
}
