//DEPS org.apache.commons:commons-collections4:4.4
import org.apache.commons.collections4.map.LRUMap;

public class CachePutGet {
  static String g(LRUMap<String, Integer> c, String k) {
    Integer v = c.get(k);
    return v == null ? "miss" : v.toString();
  }

  public static void main(String[] a) {
    LRUMap<String, Integer> c = new LRUMap<>(3);
    c.put("a", 1);
    System.out.println(g(c, "a"));
  }
}
