//JAVA 26
//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;

void main() throws Exception {
  var cfg = new Configuration(Configuration.VERSION_2_3_33);
  var src = "${name!\"anonymous\"}";
  var t = new Template("x", new StringReader(src), cfg);
  Map<String, Object> data = new HashMap<>();
  var out = new StringWriter();
  t.process(data, out);
  System.out.print(out.toString());
  System.out.println();
}
