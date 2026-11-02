//JAVA 26
//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;

void main() throws Exception {
  var cfg = new Configuration(Configuration.VERSION_2_3_33);
  var src = "${user.name}";
  var t = new Template("nested", new StringReader(src), cfg);
  Map<String,Object> user = new HashMap<>();
  user.put("name", "alice");
  Map<String,Object> m = new HashMap<>();
  m.put("user", user);
  var w = new StringWriter();
  t.process(m, w);
  System.out.println(w.toString());
}
