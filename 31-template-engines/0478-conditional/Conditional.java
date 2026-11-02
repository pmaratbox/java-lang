//JAVA 26
//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;
void main() throws Exception {
  var cfg = new Configuration(Configuration.VERSION_2_3_33);
  var src = "<#if logged_in>welcome<#else>guest</#if>";
  var t = new Template("x", new StringReader(src), cfg);
  Map<String,Object> m = new HashMap<>();
  m.put("logged_in", true);
  var w = new StringWriter();
  t.process(m, w);
  IO.println(w.toString());
}
