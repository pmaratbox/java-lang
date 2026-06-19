//DEPS org.apache.commons:commons-collections4:4.4
import org.apache.commons.collections4.map.LRUMap;

public class CacheLruRecency {
  static String g(LRUMap<String, Integer> c, String k) {
    Integer v = c.get(k);
    return v == null ? "miss" : v.toString();
  }

  public static void main(String[] args) {
    LRUMap<String, Integer> c = new LRUMap<>(3);
    c.put("a", 1);
    c.put("b", 2);
    c.put("c", 3);
    c.get("a");      // promotes a to most-recently-used
    c.put("d", 4);   // b is now least-recently-used -> evicted
    System.out.println(g(c, "a") + " " + g(c, "b"));  // 1 miss
  }
}
