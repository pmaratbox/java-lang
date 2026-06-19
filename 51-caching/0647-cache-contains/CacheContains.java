//DEPS org.apache.commons:commons-collections4:4.4
import org.apache.commons.collections4.map.LRUMap;

public class CacheContains {
  public static void main(String[] a) {
    LRUMap<String, Integer> c = new LRUMap<>(3);
    c.put("a", 1);
    System.out.println(c.containsKey("a") + " " + c.containsKey("x"));
  }
}
