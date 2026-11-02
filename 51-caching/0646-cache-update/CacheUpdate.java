//JAVA 26
//DEPS org.apache.commons:commons-collections4:4.4
import org.apache.commons.collections4.map.LRUMap;

static String g(LRUMap<String,Integer> c, String k) {
  var v = c.get(k);
  return v == null ? "miss" : v.toString();
}

void main() {
  // Re-putting the same key updates its value in place (no new entry).
  LRUMap<String,Integer> cache = new LRUMap<>(3);
  cache.put("a", 1);
  cache.put("a", 2); // same key -> value replaced

  IO.println(g(cache, "a"));
}
