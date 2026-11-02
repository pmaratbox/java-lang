//JAVA 26
//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;
void main() throws Exception {
  var cfg = new Configuration(Configuration.VERSION_2_3_33);
  var src = "<#list users as u>${u.name}: ${u.age}<#sep>\n</#sep></#list>";
  var t = new Template("x", new StringReader(src), cfg);

  List<Map<String,Object>> users = new ArrayList<>();
  Map<String,Object> alice = new HashMap<>(); alice.put("name", "alice"); alice.put("age", 30);
  Map<String,Object> bob = new HashMap<>(); bob.put("name", "bob"); bob.put("age", 25);
  users.add(alice); users.add(bob);

  Map<String,Object> m = new HashMap<>(); m.put("users", users);
  var w = new StringWriter(); t.process(m, w);
  IO.println(w.toString());
}
