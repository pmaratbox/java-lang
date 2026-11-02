//JAVA 26
//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;

void main() throws Exception {
  var cfg = new Configuration(Configuration.VERSION_2_3_33);
  var src = "<#list nums as n>${n}<#sep>\n</#sep></#list>";
  var t = new Template("loop", new StringReader(src), cfg);
  Map<String,Object> m = new HashMap<>();
  m.put("nums", Arrays.asList(1, 2, 3));
  var w = new StringWriter();
  t.process(m, w);
  System.out.println(w.toString());
}
