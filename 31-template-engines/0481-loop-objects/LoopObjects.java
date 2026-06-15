//DEPS org.freemarker:freemarker:2.3.33
import freemarker.template.*;
import java.io.*;
import java.util.*;
public class LoopObjects {
  public static void main(String[] a) throws Exception {
    Configuration cfg = new Configuration(Configuration.VERSION_2_3_33);
    String src = "<#list users as u>${u.name}: ${u.age}<#sep>\n</#sep></#list>";
    Template t = new Template("x", new StringReader(src), cfg);

    List<Map<String,Object>> users = new ArrayList<>();
    Map<String,Object> alice = new HashMap<>(); alice.put("name", "alice"); alice.put("age", 30);
    Map<String,Object> bob = new HashMap<>(); bob.put("name", "bob"); bob.put("age", 25);
    users.add(alice); users.add(bob);

    Map<String,Object> m = new HashMap<>(); m.put("users", users);
    StringWriter w = new StringWriter(); t.process(m, w);
    System.out.println(w.toString());
  }
}
