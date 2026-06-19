//DEPS org.apache.commons:commons-collections4:4.4
import org.apache.commons.collections4.map.LRUMap;

public class CacheSize {
  public static void main(String[] a) {
    LRUMap<String, Integer> c = new LRUMap<>(5);
    c.put("a", 1);
    c.put("b", 2);
    System.out.println(c.size());
  }
}
