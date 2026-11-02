//JAVA 26
//DEPS org.apache.commons:commons-collections4:4.4
import org.apache.commons.collections4.map.LRUMap;

static String g(LRUMap<String, Integer> c, String k) {
  var v = c.get(k);
  return v == null ? "miss" : v.toString();
}

void main() {
  LRUMap<String, Integer> c = new LRUMap<>(3);
  c.put("a", 1);
  System.out.println(g(c, "a"));
}
