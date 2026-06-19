//DEPS org.apache.commons:commons-collections4:4.4
import org.apache.commons.collections4.map.LRUMap;

public class CacheUpdate {
  static String g(LRUMap<String,Integer> c, String k) {
    Integer v = c.get(k);
    return v == null ? "miss" : v.toString();
  }

  public static void main(String[] args) {
    // Re-putting the same key updates its value in place (no new entry).
    LRUMap<String,Integer> cache = new LRUMap<>(3);
    cache.put("a", 1);
    cache.put("a", 2); // same key -> value replaced

    System.out.println(g(cache, "a"));
  }
}
