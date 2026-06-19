//DEPS org.apache.commons:commons-collections4:4.4
import org.apache.commons.collections4.map.LRUMap;

public class CacheMiss {
  static String g(LRUMap<String,Integer> c, String k){
    Integer v = c.get(k);
    return v == null ? "miss" : v.toString();
  }
  public static void main(String[] a){
    LRUMap<String,Integer> c = new LRUMap<>(3);
    // empty cache: looking up `x` finds nothing
    System.out.println(g(c, "x"));
  }
}
